package MapConverter;

import java.text.MessageFormat;

/**
 *
 * @author tiagocardoso
 */
public class SyntaxConverter {

    public static final int toCS = 0;
    public static final int toXML = 1;

    public static String createObject(int out, String hash, String[] position, String[] rotation) {
        String m = new String();
        switch (out) {
            case toCS: {
                m = MessageFormat.format("API.createObject({0}, new Vector3({1}, {2}, {3}), new Vector3({4}, {5}, {6}));",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[0],
                        rotation[1],
                        rotation[2]
                );
                break;
            }
            case toXML: {
                m = MessageFormat.format("<prop model=\"{0}\" posX=\"{1}\" posY=\"{2}\"  posZ=\"{3})\" rotX=\"{4}\" rotY=\"{5}\" rotZ=\"{6}\" />",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[0],
                        rotation[1],
                        rotation[2]
                );
                break;
            }
        }

        return m;
    }

    public static String createPickup(int out, String hash, String[] position, String[] rotation, int amount, int respawnTimer) {
        String m = new String();
        switch (out) {
            case toCS: {
                m = MessageFormat.format("API.createObject((PickupHash){0}, new Vector3({1}, {2}, {3}), new Vector3({4}, {5}, {6}), {7}, {8});",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[0],
                        rotation[1],
                        rotation[2],
                        amount,
                        respawnTimer
                );
                break;
            }
            case toXML: {
                m = MessageFormat.format("<pickup model=\"{0}\" posX=\"{1}\" posY=\"{2}\"  posZ=\"{3})\" rotX=\"{4}\" rotY=\"{5}\" rotZ=\"{6}\" amount=\"{7}\" respawn=\"{8}\" />",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[0],
                        rotation[1],
                        rotation[2],
                        amount,
                        respawnTimer
                );
                break;
            }
        }
        return m;
    }

    public static String createPed(int out, String hash, String[] position, String[] rotation) {
        String m = new String();
        switch (out) {
            case toCS: {
                m = MessageFormat.format("API.createPed((PedHash){0}, new Vector3({1}, {2}, {3}), {4}));",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[2]
                );
                break;
            }

            case toXML: {
                 m = MessageFormat.format("<ped model=\"{0}\" posX=\"{1}\" posY=\"{2}\"  posZ=\"{3})\" heading=\"{4}\" />",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[2]
                );
            }

        }
        return m;
    }

    public static String createVehicle(int out, String hash, String[] position, String[] rotation, int color1, int color2) {
        String m = new String();
        switch (out) {
            case toCS: {
                m = MessageFormat.format("API.createVehicle((VehicleHash){0}, new Vector3({1}, {2}, {3}), new Vector3({4}, {5}, {6}), {7}, {8});",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[0],
                        rotation[1],
                        rotation[2],
                        color1,
                        color2
                );
                break;
            }
            case toXML: {
                m = MessageFormat.format("<vehicle model =\"{0}\" posX=\"{1}\" posY=\"{2}\"  posZ=\"{3})\" rotX=\"{4}\" rotY=\"{5}\" rotZ=\"{6}\" color1=\"{7}\" color2=\"{8}\" />",
                        hash,
                        position[0],
                        position[1],
                        position[2],
                        rotation[0],
                        rotation[1],
                        rotation[2],
                        color1,
                        color2
                );
                break;
            }

        }
        return m;
    }
}
