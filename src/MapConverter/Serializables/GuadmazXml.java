package MapConverter.Serializables;

import java.util.List;
import java.util.Locale;
import org.simpleframework.xml.*;

/**
 *
 * @author tiagocardoso
 */
public class GuadmazXml {

    private Objects Objects;

    private Markers Markers;

    public Objects getObjects() {
        return Objects;
    }

    public Markers getMarkers() {
        return Markers;
    }

    @Root(strict = false)
    public static class Objects {

        @ElementList(entry = "MapObject", inline = true)
        private List<MapObject> MapObject;

        public Objects() {
        }

        public List<MapObject> getMapObject() {
            return MapObject;
        }

        public void setMapObject(List<MapObject> MapObject) {
            this.MapObject = MapObject;
        }

    }

    public static class Markers {

    }

    public static class MapObject {

        @Element
        private String Type;

        @Element
        private Position Position;

        @Element
        private Rotation Rotation;

        @Element
        private String Hash;

        @Element
        private boolean Dynamic;

        @Element
        private Quaternion Quaternion;

        @Element(required = false)
        private int Amount;

        @Element(required = false)
        private int RespawnTimer;

        @Element(required = false)
        private String Weapon;

        @Element(required = false)
        private int PrimaryColor;

        @Element(required = false)
        private int SecondaryColor;

        public MapObject() {
        }
        
        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public Position getPosition() {
            return Position;
        }

        public void setPosition(Position Position) {
            this.Position = Position;
        }

        public Rotation getRotation() {
            return Rotation;
        }

        public void setRotation(Rotation Rotation) {
            this.Rotation = Rotation;
        }

        public String getHash() {
            return Hash;
        }

        public void setHash(String Hash) {
            this.Hash = Hash;
        }

        public boolean isDynamic() {
            return Dynamic;
        }

        public void setDynamic(boolean Dynamic) {
            this.Dynamic = Dynamic;
        }

        public Quaternion getQuaternion() {
            return Quaternion;
        }

        public void setQuaternion(Quaternion Quaternion) {
            this.Quaternion = Quaternion;
        }

        public int getAmount() {
            return Amount;
        }

        public void setAmount(int Amount) {
            this.Amount = Amount;
        }

        public int getRespawnTimer() {
            return RespawnTimer;
        }

        public void setRespawnTimer(int RespawnTimer) {
            this.RespawnTimer = RespawnTimer;
        }

        
        public String getWeapon() {
            return Weapon;
        }

        public void setWeapon(String Weapon) {
            this.Weapon = Weapon;
        }

        public int getPrimaryColor() {
            return PrimaryColor;
        }

        public void setPrimaryColor(int PrimaryColor) {
            this.PrimaryColor = PrimaryColor;
        }

        public int getSecondaryColor() {
            return SecondaryColor;
        }

        public void setSecondaryColor(int SecondaryColor) {
            this.SecondaryColor = SecondaryColor;
        }
        
        public String[] getPositions() {
            String[] pos = new String[3];
            
            pos[0] = String.format(Locale.US,"%.8f", this.Position.getX());
            pos[1] = String.format(Locale.US,"%.8f", this.Position.getY());
            pos[2] = String.format(Locale.US,"%.8f", this.Position.getZ());
            
            return pos;
        }
        
        public String[] getRotations() {
            String[] rot = new String[3];
            
            rot[0] = String.format(Locale.US,"%.8f", this.Rotation.getX());
            rot[1] = String.format(Locale.US,"%.8f", this.Rotation.getY());
            rot[2] = String.format(Locale.US,"%.8f", this.Rotation.getZ());
            
            return rot;
        }
        
        public String[] getQuaternions() {
            String[] rot = new String[3];
            
            rot[0] = String.format(Locale.US,"%.8f", this.Quaternion.getX());
            rot[1] = String.format(Locale.US,"%.8f", this.Quaternion.getY());
            rot[2] = String.format(Locale.US,"%.8f", this.Quaternion.getZ());
            rot[3] = String.format(Locale.US,"%.8f", this.Quaternion.getW());
            
            return rot;
        }

    }

    public static class Position {

        @Element
        private double X;

        @Element
        private double Y;

        @Element
        private double Z;

        public double getX() {
            return X;
        }

        public void setX(double X) {
            this.X = X;
        }

        public double getY() {
            return Y;
        }

        public void setY(double Y) {
            this.Y = Y;
        }

        public double getZ() {
            return Z;
        }

        public void setZ(double Z) {
            this.Z = Z;
        }
    }

    public static class Rotation {

        @Element
        private double X;

        @Element
        private double Y;

        @Element
        private double Z;

        public double getX() {
            return X;
        }

        public void setX(double X) {
            this.X = X;
        }

        public double getY() {
            return Y;
        }

        public void setY(double Y) {
            this.Y = Y;
        }

        public double getZ() {
            return Z;
        }

        public void setZ(double Z) {
            this.Z = Z;
        }
    }

    public static class Quaternion {

        @Element
        private double X;

        @Element
        private double Y;

        @Element
        private double Z;

        @Element
        private double W;

        public double getX() {
            return X;
        }

        public void setX(double X) {
            this.X = X;
        }

        public double getY() {
            return Y;
        }

        public void setY(double Y) {
            this.Y = Y;
        }

        public double getZ() {
            return Z;
        }

        public void setZ(double Z) {
            this.Z = Z;
        }

        public double getW() {
            return W;
        }

        public void setW(double W) {
            this.W = W;
        }
    }
}
