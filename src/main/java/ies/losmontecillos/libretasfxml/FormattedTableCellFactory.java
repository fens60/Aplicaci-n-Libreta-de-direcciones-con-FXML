package ies.losmontecillos.libretasfxml;
import java.text.Format;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.text.TextAlignment;
import javafx.util.Callback;

public class FormattedTableCellFactory<S, T> implements Callback<TableColumn<S, T>, TableCell<S, T>> {
    private TextAlignment alignment;
    private Format format;

    public FormattedTableCellFactory() {
    }

    public TextAlignment getAlignment() {
        return this.alignment;
    }

    public void setAlignment(TextAlignment alignment) {
        this.alignment = alignment;
    }

    public Format getFormat() {
        return this.format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public TableCell<S, T> call(TableColumn<S, T> p) {
        TableCell<S, T> cell = new TableCell<S, T>() {
            public void updateItem(Object item, boolean empty) {
                if (item != this.getItem()) {
                    super.updateItem((T) item, empty);
                    if (item == null) {
                        super.setText((String)null);
                        super.setGraphic((Node)null);
                    } else if (FormattedTableCellFactory.this.format != null) {
                        super.setText(FormattedTableCellFactory.this.format.format(item));
                    } else if (item instanceof Node) {
                        super.setText((String)null);
                        super.setGraphic((Node)item);
                    } else {
                        super.setText(item.toString());
                        super.setGraphic((Node)null);
                    }

                }
            }
        };
        cell.setTextAlignment(this.alignment);
        switch (this.alignment) {
            case CENTER -> cell.setAlignment(Pos.CENTER);
            case RIGHT -> cell.setAlignment(Pos.CENTER_RIGHT);
            default -> cell.setAlignment(Pos.CENTER_LEFT);
        }

        return cell;
    }
}