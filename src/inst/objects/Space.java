/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inst.objects;

/**
 *
 * @author wilknis
 */
public class Space {
    private String space;
    private String type;
    private float area;
    private float perimeter;

    public Space(String space, String type, float area, float perimeter) {
        this.space = space;
        this.type = type;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Space{" + "space=" + space + ", type=" + type + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
    
    
}
