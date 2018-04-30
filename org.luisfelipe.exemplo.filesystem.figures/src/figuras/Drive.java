package figuras;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
public class Drive extends Figure{
	
	public Drive(){
		this.setMinimumSize(new Dimension(80,60));
	}
	
	@Override
	public void paint(Graphics graphics) {
		Rectangle r = getBounds();
	
		Point p1=new Point(r.x+15*r.width/18,r.y+3*r.height/18);
		Point p2=new Point(r.x+16*r.width/18,r.y+3*r.height/18);
		Point p3=new Point(r.x+16*r.width/18,r.y+4*r.height/18);
		Point p4=new Point(r.x+15*r.width/18,r.y+4*r.height/18);
		Point p5 =new Point(r.x+17*r.width/18,r.y+4*r.height/18);
		Point p6=new Point(r.x+15*r.width/18,r.y+6*r.height/18);
		Point p7=new Point(r.x+17*r.width/18,r.y+6*r.height/18);
		PointList pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p4);
		pointList.addPoint(p5);
		pointList.addPoint(p6);
		pointList.addPoint(p7);
		// Fill the shape
		graphics.fillPolygon(pointList);
		
		// Draw the outline
		graphics.setLineWidth(1);

		graphics.drawLine(p1, p2);
		graphics.drawLine(p2, p3);
		graphics.drawLine(p1, p4);
		graphics.drawLine(p4, p5);
		graphics.drawLine(p5, p7);
		graphics.drawLine(p6, p7);
		graphics.drawLine(p6, p4);
		
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		//LayoutUtil.moveToCenterAndUp(label, this, graphics);
		
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		/*label = (WrappingLabel) getChildren().get(1);
		//LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);*/

	}
}
