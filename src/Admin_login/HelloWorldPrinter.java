/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_login;

import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import static java.lang.String.format;

/**
 *
 * @author ashank
 */
public class HelloWorldPrinter implements Printable {
final Component comp;
  
public HelloWorldPrinter(Component comp){
        this.comp = comp;
    }

    HelloWorldPrinter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int print(Graphics graphics, PageFormat format, int pageIndex) throws PrinterException {
        
            // We have only one page, and 'page'
    // is zero-based
  if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }
        System.out.println("1");
        // get the bounds of the component
        Dimension dim = comp.getSize();
        double cHeight = dim.getHeight();
        double cWidth = dim.getWidth();

        // get the bounds of the printable area
        double pHeight = format.getImageableHeight();
        double pWidth = format.getImageableWidth();

        double pXStart = format.getImageableX();
        double pYStart = format.getImageableY();

        double xRatio = pWidth / cWidth;
        double yRatio = pHeight / cHeight;


        Graphics2D g2 = (Graphics2D) graphics;
        g2.translate(pXStart, pYStart);
        g2.scale(xRatio, yRatio);
        comp.paint(g2);
        System.out.println("123456");
        return Printable.PAGE_EXISTS;    }
}

