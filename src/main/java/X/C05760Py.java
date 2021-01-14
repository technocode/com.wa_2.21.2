package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* renamed from: X.0Py  reason: invalid class name and case insensitive filesystem */
public class C05760Py {
    public int A00 = -1;
    public int A01;
    public final AnonymousClass0Q5 A02 = new AnonymousClass0Q5();

    public static int A00(long j, AnonymousClass0Q5 r7) {
        if (j == 0) {
            return 1;
        }
        if (j == 1) {
            return 2;
        }
        r7.write((byte) ((int) j));
        if (-128 <= j && j <= 127) {
            return 3;
        }
        r7.write((byte) ((int) (j >> 8)));
        if (-32768 <= j && j <= 32767) {
            return 4;
        }
        r7.write((byte) ((int) (j >> 16)));
        r7.write((byte) ((int) (j >> 24)));
        if (-2147483648L <= j && j <= 2147483647L) {
            return 5;
        }
        r7.write((byte) ((int) (j >> 32)));
        r7.write((byte) ((int) (j >> 40)));
        r7.write((byte) ((int) (j >> 48)));
        r7.write((byte) ((int) (j >> 56)));
        return 6;
    }

    public static int A01(long j, AnonymousClass0Q5 r5) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("Value is not an unsigned integer");
        }
        r5.write((byte) ((int) j));
        if (j <= 255) {
            return 1;
        }
        r5.write((byte) ((int) (j >> 8)));
        if (j <= 65535) {
            return 2;
        }
        r5.write((byte) ((int) (j >> 16)));
        r5.write((byte) ((int) (j >> 24)));
        return 4;
    }

    public static long A02(int i, ByteBuffer byteBuffer) {
        if (4 >= i) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j |= (((long) byteBuffer.get()) & 255) << (i2 << 3);
            }
            return j;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("Invalid number of bytes: ", i));
    }

    public static AnonymousClass0Q2 A03(ByteBuffer byteBuffer) {
        long A022;
        int i;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int position = byteBuffer.position();
        byte b = byteBuffer.get();
        int i2 = b & 3;
        if (i2 <= 2) {
            boolean z = true;
            if ((b & 8) == 0) {
                z = false;
            }
            if (!z) {
                A022 = A02(1, byteBuffer);
            } else {
                A022 = A02(2, byteBuffer);
            }
            int i3 = (int) A022;
            int i4 = (b >> 4) & 15;
            if (i4 <= 10) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                switch (i4) {
                    case 0:
                        i = null;
                        break;
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = Byte.valueOf(byteBuffer.get());
                        break;
                    case 4:
                        i = Short.valueOf(byteBuffer.getShort());
                        break;
                    case 5:
                        i = Integer.valueOf(byteBuffer.getInt());
                        break;
                    case 6:
                        i = Long.valueOf(byteBuffer.getLong());
                        break;
                    case 7:
                        i = Double.valueOf(byteBuffer.getDouble());
                        break;
                    case 8:
                        i = A04((int) A02(1, byteBuffer), byteBuffer);
                        break;
                    case 9:
                        i = A04((int) A02(2, byteBuffer), byteBuffer);
                        break;
                    case 10:
                        i = A04((int) A02(4, byteBuffer), byteBuffer);
                        break;
                    default:
                        throw new Error("Invalid value type");
                }
                return new AnonymousClass0Q2(i2, i3, i);
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value type ");
                sb.append(i4);
                throw new IllegalArgumentException(sb.toString());
            } catch (IllegalArgumentException e) {
                String format = String.format(Locale.US, "%02X ", Byte.valueOf(b));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e);
                sb2.append(" at ");
                sb2.append(position);
                sb2.append(", tag: ");
                sb2.append(format);
                throw new AnonymousClass2OG(sb2.toString());
            }
        } else {
            try {
                throw new IllegalArgumentException("Invalid record type");
            } catch (IllegalArgumentException e2) {
                String format2 = String.format(Locale.US, "%02X ", Byte.valueOf(b));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e2);
                sb3.append(" at ");
                sb3.append(position);
                sb3.append(", tag: ");
                sb3.append(format2);
                throw new AnonymousClass2OG(sb3.toString());
            }
        }
    }

    public static String A04(int i, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("UnsupportedEncoding: ");
            sb.append(e);
            throw new AnonymousClass2OG(sb.toString());
        }
    }

    public void A05() {
        this.A02.reset();
        this.A00 = -1;
        this.A01 = 0;
    }

    public final void A06(int i, int i2, Object obj) {
        int i3;
        AnonymousClass0Q5 r8 = this.A02;
        this.A00 = r8.size();
        int i4 = 0;
        r8.write(0);
        int A012 = A01((long) i2, r8);
        if (A012 != 1) {
            if (A012 == 2) {
                i4 = 1;
            } else {
                throw new Error("Id too big to fit in 2 bytes");
            }
        }
        if (obj == null) {
            i3 = 0;
        } else if (obj instanceof Boolean) {
            i3 = A00(((Boolean) obj).booleanValue() ? 1 : 0, r8);
        } else if (obj instanceof Long) {
            i3 = A00(((Number) obj).longValue(), r8);
        } else if (obj instanceof Number) {
            double doubleValue = ((Number) obj).doubleValue();
            long j = (long) doubleValue;
            if (((double) j) == doubleValue) {
                i3 = A00(j, r8);
            } else {
                long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue);
                r8.write((byte) ((int) doubleToRawLongBits));
                r8.write((byte) ((int) (doubleToRawLongBits >> 8)));
                r8.write((byte) ((int) (doubleToRawLongBits >> 16)));
                r8.write((byte) ((int) (doubleToRawLongBits >> 24)));
                r8.write((byte) ((int) (doubleToRawLongBits >> 32)));
                r8.write((byte) ((int) (doubleToRawLongBits >> 40)));
                r8.write((byte) ((int) (doubleToRawLongBits >> 48)));
                r8.write((byte) ((int) (doubleToRawLongBits >> 56)));
                i3 = 7;
            }
        } else if (obj instanceof String) {
            try {
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                int length = bytes.length;
                if (length > 1024) {
                    Log.w(String.format(Locale.US, "wam/serialize: string length is limited to %d UTF-8 bytes", 1024));
                }
                int min = Math.min(length, 1024);
                int A013 = A01((long) min, r8);
                r8.write(bytes, 0, min);
                if (A013 == 1) {
                    i3 = 8;
                } else if (A013 == 2) {
                    i3 = 9;
                } else if (A013 == 4) {
                    i3 = 10;
                } else {
                    throw new Error("Impossible");
                }
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("Expected class Boolean, Number, or String, got ");
            A0S.append(obj.getClass().getName());
            throw new IllegalArgumentException(A0S.toString());
        }
        r8.A01()[this.A00] = (byte) (i | (i3 << 4) | (i4 << 3));
        this.A01++;
    }
}
