package MapConverter.Serializables;

import java.util.List;
import java.util.Locale;
import org.simpleframework.xml.*;

/**
 *
 * @author tiagocardoso
 */
public class MenyooXml {
    
    @Element
    private ReferenceCoords ReferenceCoords;

    @ElementList(entry = "Placement", inline = true)
    private List<Placement> Placement;

    public ReferenceCoords getReferenceCoords() {
        return ReferenceCoords;
    }

    public void setReferenceCoords(ReferenceCoords ReferenceCoords) {
        this.ReferenceCoords = ReferenceCoords;
    }

    public List<Placement> getPlacement() {
        return Placement;
    }

    public void setPlacement(List<Placement> Placement) {
        this.Placement = Placement;
    }
    
    public static class ReferenceCoords {

        @Element
        public double X;

        @Element
        public double Y;

        @Element
        public double Z;

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

    public static class Placement {

        @Element
        private String ModelHash;

        @Element
        private int Type;

        @Element
        private String HashName;

        @Element
        private int MaxHealth;

        @Element
        private int Health;

        @Element(required = false)
        private PositionRotation PositionRotation;
        
        @Element(required = false)
        private VehicleProperties VehicleProperties;
        
        public Placement() {
        }
        
        public String getModelHash() {
            return ModelHash;
        }

        public void setModelHash(String ModelHash) {
            this.ModelHash = ModelHash;
        }

        public int getType() {
            return Type;
        }

        public void setType(int Type) {
            this.Type = Type;
        }

        public String getHashName() {
            return HashName;
        }

        public void setHashName(String HashName) {
            this.HashName = HashName;
        }

        public int getMaxHealth() {
            return MaxHealth;
        }

        public void setMaxHealth(int MaxHealth) {
            this.MaxHealth = MaxHealth;
        }

        public int getHealth() {
            return Health;
        }

        public void setHealth(int Health) {
            this.Health = Health;
        }

        public VehicleProperties getVehicleProperties() {
            return VehicleProperties;
        }

        public void setVehicleProperties(VehicleProperties VehicleProperties) {
            this.VehicleProperties = VehicleProperties;
        }
        
        public String[] getPositions() {
            String[] pos = new String[3];
            
            pos[0] = String.format(Locale.US,"%.8f", this.PositionRotation.getX());
            pos[1] = String.format(Locale.US,"%.8f", this.PositionRotation.getY());
            pos[2] = String.format(Locale.US,"%.8f", this.PositionRotation.getZ());
            
            return pos;
        }
        
        public String[] getRotations() {
            String[] rot = new String[3];
            
            rot[0] = String.format(Locale.US,"%.8f", this.PositionRotation.getPitch());
            rot[1] = String.format(Locale.US,"%.8f", this.PositionRotation.getRoll());
            rot[2] = String.format(Locale.US,"%.8f", this.PositionRotation.getYaw());
            
            return rot;
        }
    }

    public static class PositionRotation {

        @Element
        public double X;

        @Element
        public double Y;

        @Element
        public double Z;

        @Element
        public double Pitch;

        @Element
        public double Roll;

        @Element
        public double Yaw;

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

        public double getPitch() {
            return Pitch;
        }

        public void setPitch(double Pitch) {
            this.Pitch = Pitch;
        }

        public double getRoll() {
            return Roll;
        }

        public void setRoll(double Roll) {
            this.Roll = Roll;
        }

        public double getYaw() {
            return Yaw;
        }

        public void setYaw(double Yaw) {
            this.Yaw = Yaw;
        }
        
    }

    public static class VehicleProperties {
        @Element
        private Colours Colours;

        public Colours getColours() {
            return Colours;
        }

        public void setColours(Colours Colours) {
            this.Colours = Colours;
        }
    }

    public static class Colours {

        @Element
        public int Primary;

        @Element
        public int Secondary;

        public int getPrimary() {
            return Primary;
        }

        public void setPrimary(int Primary) {
            this.Primary = Primary;
        }

        public int getSecondary() {
            return Secondary;
        }

        public void setSecondary(int Secondary) {
            this.Secondary = Secondary;
        }
    }
    
    public static class Marker {

        @Element
        public String Name;

        @Element
        public int Type;

        @Element
        public double Scale;
        
    }

    /*
        <Marker>
		<Name></Name>
		<Type>1</Type>
		<Scale>0.75</Scale>
		<RotateContinuously>false</RotateContinuously>
		<AllowVehicles>false</AllowVehicles>
		<Colour R="93" G="182" B="230" A="0" />
		<Position X="-867.642639" Y="-2118.2937" Z="81.9427719" />
		<Rotation X="0" Y="0" Z="2.70040321" />
		<Destination X="-880.802551" Y="-2176.57153" Z="9.8090477" />
		<DestinationHeading>136</DestinationHeading>
	</Marker>
     */
}
