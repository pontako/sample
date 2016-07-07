

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
//      byte[] bytes_1 = new byte[] {
//              (byte)0xFF,
//      };
//
//      byte[] bytes_2 = new byte[] {
//              (byte)0xFF,
//              (byte)0xFF,
//      };
//
//      byte[] bytes_3 = new byte[] {
//              (byte)0xFF,
//              (byte)0xFF,
//              (byte)0xFF,
//      };
//
//      byte[] bytes_4 = new byte[] {
//              (byte)0xFF,
//              (byte)0xFF,
//              (byte)0xFF,
//              (byte)0xFF,
//      };

        byte[] bytes_1 = new byte[] {
                (byte)0x01,
        };

        byte[] bytes_2 = new byte[] {
                (byte)0x01,
                (byte)0x02,
        };

        byte[] bytes_3 = new byte[] {
                (byte)0x01,
                (byte)0x02,
                (byte)0x03,
        };

        byte[] bytes_4 = new byte[] {
                (byte)0x01,
                (byte)0x02,
                (byte)0x03,
                (byte)0x04,
        };

        byte[] bytes_5 = new byte[] {
                (byte)0x01,
                (byte)0x02,
                (byte)0x03,
                (byte)0x04,
                (byte)0x05,
        };

        int i;
        i = byteArrayToInt(bytes_1, false);
        i = byteArrayToInt(bytes_2, false);
        i = byteArrayToInt(bytes_3, false);
        i = byteArrayToInt(bytes_4, false);
//      i = byteArrayToInt(bytes_5, false);
        
        i = byteArrayToInt(bytes_1, true);
        i = byteArrayToInt(bytes_2, true);
        i = byteArrayToInt(bytes_3, true);
        i = byteArrayToInt(bytes_4, true);
//      i = byteArrayToInt(bytes_5, true);
        i = byteArrayToInt(null, false);

    }

    private static final int INTEGER_BYTE_SIZE = Integer.SIZE / Byte.SIZE;
    /**
     * Convert to integer value from byte array.
     * 
     * @param bytes byte array
     * @param reverse whether reverse byte-array(Similar to ByteOrder.LITTLE_ENDIAN)
     * @return integer value
     */
    public static int byteArrayToInt(byte[] bytes, boolean reverse) {
        System.out.println("byteToInt start ----------->" + "reverse:" + reverse);
        if (bytes == null || 
                bytes.length <= 0 || INTEGER_BYTE_SIZE < bytes.length) {
            throw new IllegalArgumentException("null or invalid length.");
        }

        if (reverse) {
            byte[] reversed = new byte[bytes.length];
            for (int i = 0; i < bytes.length; i++) {
                reversed[i] = bytes[bytes.length - i - 1];
            }
            bytes = reversed;
        }

        int result = 0;
        for (byte b : bytes) {
            result = result << 8 | (b & 0xFF);
            System.out.println("result:" + String.format("%08X", result));
        }
        System.out.println("return result:" + result + " hex:" + String.format("%08X", result));
        return result;
    }

}

