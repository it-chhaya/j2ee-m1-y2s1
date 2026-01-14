package co.istad.jdbc.view;

import co.istad.jdbc.model.Product;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class ViewUtil {

    public static void printMenu() {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.setColumnWidth(0, 50, 100);
        table.addCell("Application Menu", cellStyle);
        table.addCell("1)List All  2)Search  3)Add new  4)Update", cellStyle);
        table.addCell("5)Delete  0)Exit", cellStyle);
        print(table.render(), true);
    }

    public static void print(String text, boolean isNewLine) {
        if (isNewLine)
            System.out.println(text);
        else
            System.out.print(text);
    }

    public static void printHeader(String text) {
        Table table = new Table(1,
                BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.addCell(text);
        print(table.render(), true);
    }

    public static void printProductList(List<Product> products) {
        // 1. Create table with 6 columns and border style
        Table table = new Table(6, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        // 2. Add table header
        table.addCell("ID");
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("PRICE");
        table.addCell("QTY");
        table.addCell("IS_DELETED");

        // 3. Add table data
        for (Product obj : products) {
            table.addCell(obj.getId().toString());
            table.addCell(obj.getCode());
            table.addCell(obj.getName());
            table.addCell(obj.getPrice().toString());
            table.addCell(obj.getQty().toString());
            table.addCell(obj.getDeleted().toString());
        }

        // 4. Render table
        print(table.render(), true);
    }

}
