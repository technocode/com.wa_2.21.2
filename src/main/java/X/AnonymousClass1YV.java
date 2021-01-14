package X;

import android.opengl.GLES20;
import android.os.SystemClock;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.ParseException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1YV  reason: invalid class name */
public class AnonymousClass1YV {
    public static AnonymousClass0LI A00;

    public static int A00(AnonymousClass1XO r1) {
        if (r1 == AnonymousClass1XO.A0D) {
            return 1;
        }
        if (AnonymousClass1XO.A0A == r1 || AnonymousClass1XO.A0C == r1) {
            return 0;
        }
        if (AnonymousClass1XO.A05 == r1) {
            return 2;
        }
        if (AnonymousClass1XO.A07 == r1) {
            return 3;
        }
        if (AnonymousClass1XO.A0N == r1) {
            return 4;
        }
        if (AnonymousClass1XO.A04 == r1) {
            return 5;
        }
        if (AnonymousClass1XO.A0I == r1) {
            return 6;
        }
        if (AnonymousClass1XO.A0E == r1) {
            return 8;
        }
        return AnonymousClass1XO.A0F == r1 ? 9 : -1;
    }

    public static int A01(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public static int A02(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static long A03(byte[] bArr, int i) {
        return ((((long) bArr[i + 2]) << 16) & 16711680) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280);
    }

    public static long A04(byte[] bArr, int i) {
        return ((((long) bArr[i + 2]) << 16) & 16711680) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280);
    }

    public static long A05(byte[] bArr, int i) {
        return ((((long) bArr[i + 2]) << 16) & 16711680) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280);
    }

    public static long A06(byte[] bArr, int i) {
        return ((((long) bArr[i + 3]) << 24) & 4278190080L) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280) | ((((long) bArr[i + 2]) << 16) & 16711680);
    }

    public static long A07(byte[] bArr, int i) {
        return ((((long) bArr[i + 3]) << 24) & 4278190080L) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280) | ((((long) bArr[i + 2]) << 16) & 16711680);
    }

    public static long A08(byte[] bArr, int i) {
        return ((((long) bArr[i + 3]) << 24) & 4278190080L) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280) | ((((long) bArr[i + 2]) << 16) & 16711680);
    }

    public static String A09(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", Integer.valueOf(bArr[i] & 255)));
        }
        return sb.toString();
    }

    public static C11500gQ A0A(int i, int i2) {
        if (i != 1 && i != 5) {
            throw new IllegalStateException("unknown type scheme for PBE encryption.");
        } else if (i2 == 0) {
            return new C11500gQ(new AnonymousClass2A8());
        } else {
            if (i2 == 1) {
                return new C11500gQ(new AnonymousClass0Qf());
            }
            if (i2 == 4) {
                return new C11500gQ(new C05830Qk());
            }
            throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
        }
    }

    public static C68303Cr A0B(byte[] bArr) {
        AnonymousClass3XC r4 = new AnonymousClass3XC();
        byte[][] A0h = A0h(r4.A01(bArr, new byte[32], "WhisperText".getBytes(), 64), 32, 32);
        return new C68303Cr(new C68313Cs(r4, A0h[0]), new C68283Cp(r4, A0h[1], 0));
    }

    public static void A0C(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void A0D(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void A0E(long j, byte[] bArr, int i) {
        A0C((int) (j >>> 32), bArr, i);
        A0C((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void A0F(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        int i = 0;
        if (cls.isArray()) {
            sb.append("[");
            while (i < Array.getLength(obj)) {
                A0F(Array.get(obj, i), sb);
                sb.append(",");
                i++;
            }
            sb.replace(sb.length() - 1, sb.length(), "]");
        } else if (cls.equals(String.class)) {
            sb.append("\"");
            sb.append(obj);
            sb.append("\"");
        } else if (cls.isPrimitive() || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(BigDecimal.class)) {
            sb.append(String.valueOf(obj));
        } else {
            try {
                sb.append("{");
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        sb.append("\"");
                        sb.append(field.getName());
                        sb.append("\"");
                        sb.append(":");
                        A0F(field.get(obj), sb);
                        sb.append(",");
                    }
                    i++;
                }
                sb.replace(sb.length() - 1, sb.length(), "}");
            } catch (IllegalAccessException unused) {
                Log.e("PAY: failed to convert to json string");
            }
        }
    }

    public static void A0G(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": GLES20 error: ");
            sb.append(glGetError);
            throw new RuntimeException(sb.toString());
        }
    }

    public static void A0H(Throwable th) {
        String obj;
        Throwable th2 = th;
        while (true) {
            if (th2 == null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                obj = stringWriter.toString();
                break;
            } else if (th2 instanceof UnknownHostException) {
                obj = "";
                break;
            } else {
                th2 = th2.getCause();
            }
        }
        if (A00 != null) {
            Log.w(AnonymousClass008.A0M("SignalProtocolLogger (", "SessionRecordV2", "): ", obj));
        }
    }

    public static void A0I(AnonymousClass3CS r7, AnonymousClass3CU r8, AnonymousClass3CP r9) {
        int[] iArr = new int[10];
        int[] iArr2 = r7.A01;
        int[] iArr3 = r8.A02;
        int[] iArr4 = r8.A01;
        A0X(iArr2, iArr3, iArr4);
        int[] iArr5 = r7.A02;
        A0Z(iArr5, iArr3, iArr4);
        int[] iArr6 = r7.A03;
        A0Y(iArr6, iArr2, r9.A02);
        A0Y(iArr5, iArr5, r9.A01);
        int[] iArr7 = r7.A00;
        A0Y(iArr7, r9.A00, r8.A00);
        A0Y(iArr2, r8.A03, r9.A03);
        A0X(iArr, iArr2, iArr2);
        A0Z(iArr2, iArr6, iArr5);
        A0X(iArr5, iArr6, iArr5);
        A0X(iArr6, iArr, iArr7);
        A0Z(iArr7, iArr, iArr7);
    }

    public static void A0J(AnonymousClass3CS r7, AnonymousClass3CU r8, AnonymousClass3CW r9) {
        int[] iArr = new int[10];
        int[] iArr2 = r7.A01;
        int[] iArr3 = r8.A02;
        int[] iArr4 = r8.A01;
        A0X(iArr2, iArr3, iArr4);
        int[] iArr5 = r7.A02;
        A0Z(iArr5, iArr3, iArr4);
        int[] iArr6 = r7.A03;
        A0Y(iArr6, iArr2, r9.A02);
        A0Y(iArr5, iArr5, r9.A01);
        int[] iArr7 = r7.A00;
        A0Y(iArr7, r9.A00, r8.A00);
        int[] iArr8 = r8.A03;
        A0X(iArr, iArr8, iArr8);
        A0Z(iArr2, iArr6, iArr5);
        A0X(iArr5, iArr6, iArr5);
        A0X(iArr6, iArr, iArr7);
        A0Z(iArr7, iArr, iArr7);
    }

    public static void A0K(AnonymousClass3CT r4, AnonymousClass3CS r5) {
        int[] iArr = r4.A00;
        int[] iArr2 = r5.A01;
        int[] iArr3 = r5.A00;
        A0Y(iArr, iArr2, iArr3);
        int[] iArr4 = r4.A01;
        int[] iArr5 = r5.A02;
        int[] iArr6 = r5.A03;
        A0Y(iArr4, iArr5, iArr6);
        A0Y(r4.A02, iArr6, iArr3);
    }

    public static void A0L(AnonymousClass3CU r5, AnonymousClass3CS r6) {
        int[] iArr = r5.A01;
        int[] iArr2 = r6.A01;
        int[] iArr3 = r6.A00;
        A0Y(iArr, iArr2, iArr3);
        int[] iArr4 = r5.A02;
        int[] iArr5 = r6.A02;
        int[] iArr6 = r6.A03;
        A0Y(iArr4, iArr5, iArr6);
        A0Y(r5.A03, iArr6, iArr3);
        A0Y(r5.A00, iArr2, iArr5);
    }

    public static void A0M(byte[] bArr) {
        long A05 = (A05(bArr, 47) >>> 2) & 2097151;
        long A08 = (A08(bArr, 49) >>> 7) & 2097151;
        long A082 = (A08(bArr, 52) >>> 4) & 2097151;
        long A052 = (A05(bArr, 55) >>> 1) & 2097151;
        long A083 = (A08(bArr, 57) >>> 6) & 2097151;
        long A084 = A08(bArr, 60) >>> 3;
        long j = A084 * 666643;
        long j2 = A084 * 470296;
        long j3 = A084 * 654183;
        long A085 = ((A08(bArr, 36) >>> 6) & 2097151) - (A084 * 997805);
        long A053 = (A084 * 136657) + ((A05(bArr, 39) >>> 3) & 2097151);
        long A054 = (A05(bArr, 42) & 2097151) - (A084 * 683901);
        long A086 = (A083 * 654183) + j2 + ((A08(bArr, 31) >>> 4) & 2097151);
        long A055 = (j3 + ((A05(bArr, 34) >>> 1) & 2097151)) - (A083 * 997805);
        long j4 = A052 * 470296;
        long A056 = j4 + (A083 * 666643) + ((A05(bArr, 26) >>> 2) & 2097151);
        long j5 = A052 * 654183;
        long A087 = j5 + (A083 * 470296) + j + ((A08(bArr, 28) >>> 7) & 2097151);
        long j6 = (A052 * 136657) + A055;
        long j7 = ((A083 * 136657) + A085) - (A052 * 683901);
        long j8 = A082 * 470296;
        long A088 = j8 + (A052 * 666643) + ((A08(bArr, 23) >>> 5) & 2097151);
        long j9 = (A082 * 136657) + (A086 - (A052 * 997805));
        long j10 = A08 * 470296;
        long j11 = (A08 * 654183) + A088;
        long j12 = (A08 * 136657) + (A087 - (A082 * 997805));
        long j13 = j9 - (A08 * 683901);
        long A089 = (A05 * 666643) + ((A08(bArr, 15) >>> 6) & 2097151);
        long j14 = A05 * 470296;
        long j15 = A05 * 654183;
        long A057 = j15 + j10 + (A082 * 666643) + (A05(bArr, 21) & 2097151);
        long j16 = (A05 * 136657) + (((A082 * 654183) + A056) - (A08 * 997805));
        long j17 = (A089 + 1048576) >> 21;
        long A058 = j14 + (A08 * 666643) + ((A05(bArr, 18) >>> 3) & 2097151) + j17;
        long j18 = A089 - (j17 << 21);
        long j19 = (A057 + 1048576) >> 21;
        long j20 = (j11 - (A05 * 997805)) + j19;
        long j21 = A057 - (j19 << 21);
        long j22 = (j16 + 1048576) >> 21;
        long j23 = (j12 - (A05 * 683901)) + j22;
        long j24 = j16 - (j22 << 21);
        long j25 = (j13 + 1048576) >> 21;
        long j26 = (j6 - (A082 * 683901)) + j25;
        long j27 = j13 - (j25 << 21);
        long j28 = (j7 + 1048576) >> 21;
        long j29 = (A053 - (A083 * 683901)) + j28;
        long j30 = j7 - (j28 << 21);
        long j31 = (A054 + 1048576) >> 21;
        long A0810 = ((A08(bArr, 44) >>> 5) & 2097151) + j31;
        long j32 = A054 - (j31 << 21);
        long j33 = (A058 + 1048576) >> 21;
        long j34 = j21 + j33;
        long j35 = A058 - (j33 << 21);
        long j36 = (j20 + 1048576) >> 21;
        long j37 = j24 + j36;
        long j38 = j20 - (j36 << 21);
        long j39 = (j23 + 1048576) >> 21;
        long j40 = j27 + j39;
        long j41 = j23 - (j39 << 21);
        long j42 = (j26 + 1048576) >> 21;
        long j43 = j30 + j42;
        long j44 = j26 - (j42 << 21);
        long j45 = (j29 + 1048576) >> 21;
        long j46 = j32 + j45;
        long j47 = j29 - (j45 << 21);
        long j48 = (A0810 * 470296) + j18;
        long j49 = (A0810 * 654183) + j35;
        long j50 = (A0810 * 136657) + j38;
        long j51 = j37 - (A0810 * 683901);
        long A0811 = (j46 * 666643) + ((A08(bArr, 10) >>> 4) & 2097151);
        long j52 = j46 * 470296;
        long A059 = j52 + (A0810 * 666643) + ((A05(bArr, 13) >>> 1) & 2097151);
        long j53 = (j46 * 654183) + j48;
        long j54 = (j46 * 136657) + (j34 - (A0810 * 997805));
        long j55 = (j47 * 470296) + A0811;
        long j56 = (j47 * 654183) + A059;
        long j57 = j53 - (j47 * 997805);
        long j58 = (j47 * 136657) + (j49 - (j46 * 997805));
        long j59 = j54 - (j47 * 683901);
        long j60 = j43 * 470296;
        long A0812 = j60 + (j47 * 666643) + ((A08(bArr, 7) >>> 7) & 2097151);
        long j61 = j58 - (j43 * 683901);
        long j62 = j44 * 666643;
        long j63 = j44 * 470296;
        long A0510 = j63 + (j43 * 666643) + ((A05(bArr, 5) >>> 2) & 2097151);
        long j64 = ((j43 * 654183) + j55) - (j44 * 997805);
        long j65 = (j44 * 136657) + (j56 - (j43 * 997805));
        long j66 = ((j43 * 136657) + j57) - (j44 * 683901);
        long A0511 = (j40 * 666643) + (A05(bArr, 0) & 2097151);
        long A0813 = (j40 * 470296) + j62 + ((A08(bArr, 2) >>> 5) & 2097151);
        long j67 = (j40 * 654183) + A0510;
        long j68 = ((j44 * 654183) + A0812) - (j40 * 997805);
        long j69 = (j40 * 136657) + j64;
        long j70 = (A0511 + 1048576) >> 21;
        long j71 = A0813 + j70;
        long j72 = A0511 - (j70 << 21);
        long j73 = (j67 + 1048576) >> 21;
        long j74 = j68 + j73;
        long j75 = j67 - (j73 << 21);
        long j76 = (j69 + 1048576) >> 21;
        long j77 = (j65 - (j40 * 683901)) + j76;
        long j78 = j69 - (j76 << 21);
        long j79 = (j66 + 1048576) >> 21;
        long j80 = j61 + j79;
        long j81 = j66 - (j79 << 21);
        long j82 = (j59 + 1048576) >> 21;
        long j83 = (j50 - (j46 * 683901)) + j82;
        long j84 = j59 - (j82 << 21);
        long j85 = (j51 + 1048576) >> 21;
        long j86 = j41 + j85;
        long j87 = j51 - (j85 << 21);
        long j88 = (j71 + 1048576) >> 21;
        long j89 = j75 + j88;
        long j90 = j71 - (j88 << 21);
        long j91 = (j74 + 1048576) >> 21;
        long j92 = j78 + j91;
        long j93 = j74 - (j91 << 21);
        long j94 = (j77 + 1048576) >> 21;
        long j95 = j81 + j94;
        long j96 = j77 - (j94 << 21);
        long j97 = (j80 + 1048576) >> 21;
        long j98 = j84 + j97;
        long j99 = j80 - (j97 << 21);
        long j100 = (j83 + 1048576) >> 21;
        long j101 = j87 + j100;
        long j102 = j83 - (j100 << 21);
        long j103 = (j86 + 1048576) >> 21;
        long j104 = j103 + 0;
        long j105 = j86 - (j103 << 21);
        long j106 = (j104 * 666643) + j72;
        long j107 = (j104 * 470296) + j90;
        long j108 = j106 >> 21;
        long j109 = j107 + j108;
        long j110 = j106 - (j108 << 21);
        long j111 = j109 >> 21;
        long j112 = (j104 * 654183) + j89 + j111;
        long j113 = j109 - (j111 << 21);
        long j114 = j112 >> 21;
        long j115 = (j93 - (j104 * 997805)) + j114;
        long j116 = j112 - (j114 << 21);
        long j117 = j115 >> 21;
        long j118 = (j104 * 136657) + j92 + j117;
        long j119 = j115 - (j117 << 21);
        long j120 = j118 >> 21;
        long j121 = (j96 - (j104 * 683901)) + j120;
        long j122 = j118 - (j120 << 21);
        long j123 = j121 >> 21;
        long j124 = j95 + j123;
        long j125 = j121 - (j123 << 21);
        long j126 = j124 >> 21;
        long j127 = j99 + j126;
        long j128 = j124 - (j126 << 21);
        long j129 = j127 >> 21;
        long j130 = j98 + j129;
        long j131 = j127 - (j129 << 21);
        long j132 = j130 >> 21;
        long j133 = j102 + j132;
        long j134 = j130 - (j132 << 21);
        long j135 = j133 >> 21;
        long j136 = j101 + j135;
        long j137 = j133 - (j135 << 21);
        long j138 = j136 >> 21;
        long j139 = j105 + j138;
        long j140 = j136 - (j138 << 21);
        long j141 = j139 >> 21;
        long j142 = j141 + 0;
        long j143 = (666643 * j142) + j110;
        long j144 = j125 - (j142 * 683901);
        long j145 = j143 >> 21;
        long j146 = (470296 * j142) + j113 + j145;
        long j147 = j143 - (j145 << 21);
        long j148 = j146 >> 21;
        long j149 = (654183 * j142) + j116 + j148;
        long j150 = j146 - (j148 << 21);
        long j151 = j149 >> 21;
        long j152 = (j119 - (997805 * j142)) + j151;
        long j153 = j149 - (j151 << 21);
        long j154 = j152 >> 21;
        long j155 = (136657 * j142) + j122 + j154;
        long j156 = j152 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = j144 + j157;
        long j159 = j155 - (j157 << 21);
        long j160 = j158 >> 21;
        long j161 = j128 + j160;
        long j162 = j158 - (j160 << 21);
        long j163 = j161 >> 21;
        long j164 = j131 + j163;
        long j165 = j161 - (j163 << 21);
        long j166 = j164 >> 21;
        long j167 = j134 + j166;
        long j168 = j164 - (j166 << 21);
        long j169 = j167 >> 21;
        long j170 = j137 + j169;
        long j171 = j167 - (j169 << 21);
        long j172 = j170 >> 21;
        long j173 = j140 + j172;
        long j174 = j170 - (j172 << 21);
        long j175 = j173 >> 21;
        long j176 = (j139 - (j141 << 21)) + j175;
        long j177 = j173 - (j175 << 21);
        bArr[0] = (byte) ((int) (j147 >> 0));
        bArr[1] = (byte) ((int) (j147 >> 8));
        bArr[2] = (byte) ((int) ((j147 >> 16) | (j150 << 5)));
        bArr[3] = (byte) ((int) (j150 >> 3));
        bArr[4] = (byte) ((int) (j150 >> 11));
        bArr[5] = (byte) ((int) ((j150 >> 19) | (j153 << 2)));
        bArr[6] = (byte) ((int) (j153 >> 6));
        bArr[7] = (byte) ((int) ((j153 >> 14) | (j156 << 7)));
        bArr[8] = (byte) ((int) (j156 >> 1));
        bArr[9] = (byte) ((int) (j156 >> 9));
        bArr[10] = (byte) ((int) ((j156 >> 17) | (j159 << 4)));
        bArr[11] = (byte) ((int) (j159 >> 4));
        bArr[12] = (byte) ((int) (j159 >> 12));
        bArr[13] = (byte) ((int) ((j159 >> 20) | (j162 << 1)));
        bArr[14] = (byte) ((int) (j162 >> 7));
        bArr[15] = (byte) ((int) ((j162 >> 15) | (j165 << 6)));
        bArr[16] = (byte) ((int) (j165 >> 2));
        bArr[17] = (byte) ((int) (j165 >> 10));
        bArr[18] = (byte) ((int) ((j165 >> 18) | (j168 << 3)));
        bArr[19] = (byte) ((int) (j168 >> 5));
        bArr[20] = (byte) ((int) (j168 >> 13));
        bArr[21] = (byte) ((int) (j171 >> 0));
        bArr[22] = (byte) ((int) (j171 >> 8));
        bArr[23] = (byte) ((int) ((j171 >> 16) | (j174 << 5)));
        bArr[24] = (byte) ((int) (j174 >> 3));
        bArr[25] = (byte) ((int) (j174 >> 11));
        bArr[26] = (byte) ((int) ((j174 >> 19) | (j177 << 2)));
        bArr[27] = (byte) ((int) (j177 >> 6));
        bArr[28] = (byte) ((int) ((j177 >> 14) | (j176 << 7)));
        bArr[29] = (byte) ((int) (j176 >> 1));
        bArr[30] = (byte) ((int) (j176 >> 9));
        bArr[31] = (byte) ((int) (j176 >> 17));
    }

    public static void A0N(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = (((((((((((((i5 + ((i4 + ((i3 + ((i2 + ((i + (((i10 * 19) + EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26) + i6) >> 25) + i7) >> 26) + i8) >> 25) + i9) >> 26) + i10) >> 25) * 19) + i;
        int i12 = i11 >> 26;
        int i13 = i2 + i12;
        int i14 = i11 - (i12 << 26);
        int i15 = i13 >> 25;
        int i16 = i3 + i15;
        int i17 = i13 - (i15 << 25);
        int i18 = i16 >> 26;
        int i19 = i4 + i18;
        int i20 = i16 - (i18 << 26);
        int i21 = i19 >> 25;
        int i22 = i5 + i21;
        int i23 = i19 - (i21 << 25);
        int i24 = i22 >> 26;
        int i25 = i6 + i24;
        int i26 = i22 - (i24 << 26);
        int i27 = i25 >> 25;
        int i28 = i7 + i27;
        int i29 = i25 - (i27 << 25);
        int i30 = i28 >> 26;
        int i31 = i8 + i30;
        int i32 = i28 - (i30 << 26);
        int i33 = i31 >> 25;
        int i34 = i9 + i33;
        int i35 = i31 - (i33 << 25);
        int i36 = i34 >> 26;
        int i37 = i10 + i36;
        int i38 = i34 - (i36 << 26);
        int i39 = i37 - ((i37 >> 25) << 25);
        bArr[0] = (byte) (i14 >> 0);
        bArr[1] = (byte) (i14 >> 8);
        bArr[2] = (byte) (i14 >> 16);
        bArr[3] = (byte) ((i14 >> 24) | (i17 << 2));
        bArr[4] = (byte) (i17 >> 6);
        bArr[5] = (byte) (i17 >> 14);
        bArr[6] = (byte) ((i17 >> 22) | (i20 << 3));
        bArr[7] = (byte) (i20 >> 5);
        bArr[8] = (byte) (i20 >> 13);
        bArr[9] = (byte) ((i20 >> 21) | (i23 << 5));
        bArr[10] = (byte) (i23 >> 3);
        bArr[11] = (byte) (i23 >> 11);
        bArr[12] = (byte) ((i23 >> 19) | (i26 << 6));
        bArr[13] = (byte) (i26 >> 2);
        bArr[14] = (byte) (i26 >> 10);
        bArr[15] = (byte) (i26 >> 18);
        bArr[16] = (byte) (i29 >> 0);
        bArr[17] = (byte) (i29 >> 8);
        bArr[18] = (byte) (i29 >> 16);
        bArr[19] = (byte) ((i29 >> 24) | (i32 << 1));
        bArr[20] = (byte) (i32 >> 7);
        bArr[21] = (byte) (i32 >> 15);
        bArr[22] = (byte) ((i32 >> 23) | (i35 << 3));
        bArr[23] = (byte) (i35 >> 5);
        bArr[24] = (byte) (i35 >> 13);
        bArr[25] = (byte) ((i35 >> 21) | (i38 << 4));
        bArr[26] = (byte) (i38 >> 4);
        bArr[27] = (byte) (i38 >> 12);
        bArr[28] = (byte) ((i38 >> 20) | (i39 << 6));
        bArr[29] = (byte) (i39 >> 2);
        bArr[30] = (byte) (i39 >> 10);
        bArr[31] = (byte) (i39 >> 18);
    }

    public static void A0O(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static void A0P(int[] iArr) {
        iArr[0] = 1;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static void A0Q(int[] iArr, byte[] bArr) {
        long A06 = A06(bArr, 0);
        long A03 = A03(bArr, 4) << 6;
        long A032 = A03(bArr, 10) << 3;
        long A062 = A06(bArr, 16);
        long A033 = A03(bArr, 23) << 5;
        long A034 = (A03(bArr, 29) & 8388607) << 2;
        long j = (A034 + 16777216) >> 25;
        long j2 = (19 * j) + A06;
        long j3 = A034 - (j << 25);
        long j4 = (A03 + 16777216) >> 25;
        long A035 = (A03(bArr, 7) << 5) + j4;
        long j5 = A03 - (j4 << 25);
        long j6 = (A032 + 16777216) >> 25;
        long A036 = (A03(bArr, 13) << 2) + j6;
        long j7 = A032 - (j6 << 25);
        long j8 = (A062 + 16777216) >> 25;
        long A037 = (A03(bArr, 20) << 7) + j8;
        long j9 = A062 - (j8 << 25);
        long j10 = (A033 + 16777216) >> 25;
        long A038 = (A03(bArr, 26) << 4) + j10;
        long j11 = A033 - (j10 << 25);
        long j12 = (j2 + 33554432) >> 26;
        long j13 = j5 + j12;
        long j14 = j2 - (j12 << 26);
        long j15 = (A035 + 33554432) >> 26;
        long j16 = j7 + j15;
        long j17 = A035 - (j15 << 26);
        long j18 = (A036 + 33554432) >> 26;
        long j19 = j9 + j18;
        long j20 = A036 - (j18 << 26);
        long j21 = (A037 + 33554432) >> 26;
        long j22 = j11 + j21;
        long j23 = A037 - (j21 << 26);
        long j24 = (A038 + 33554432) >> 26;
        iArr[0] = (int) j14;
        iArr[1] = (int) j13;
        iArr[2] = (int) j17;
        iArr[3] = (int) j16;
        iArr[4] = (int) j20;
        iArr[5] = (int) j19;
        iArr[6] = (int) j23;
        iArr[7] = (int) j22;
        iArr[8] = (int) (A038 - (j24 << 26));
        iArr[9] = (int) (j3 + j24);
    }

    public static void A0R(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = i5;
        iArr[5] = i6;
        iArr[6] = i7;
        iArr[7] = i8;
        iArr[8] = i9;
        iArr[9] = i10;
    }

    public static void A0S(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        A0U(iArr3, iArr2);
        A0U(iArr4, iArr3);
        int i = 1;
        A0U(iArr4, iArr4);
        A0Y(iArr4, iArr2, iArr4);
        A0Y(iArr3, iArr3, iArr4);
        A0U(iArr5, iArr3);
        A0Y(iArr4, iArr4, iArr5);
        A0U(iArr5, iArr4);
        int i2 = 1;
        do {
            A0U(iArr5, iArr5);
            i2++;
        } while (i2 < 5);
        A0Y(iArr4, iArr5, iArr4);
        A0U(iArr5, iArr4);
        int i3 = 1;
        do {
            A0U(iArr5, iArr5);
            i3++;
        } while (i3 < 10);
        A0Y(iArr5, iArr5, iArr4);
        A0U(iArr6, iArr5);
        int i4 = 1;
        do {
            A0U(iArr6, iArr6);
            i4++;
        } while (i4 < 20);
        A0Y(iArr5, iArr6, iArr5);
        A0U(iArr5, iArr5);
        int i5 = 1;
        do {
            A0U(iArr5, iArr5);
            i5++;
        } while (i5 < 10);
        A0Y(iArr4, iArr5, iArr4);
        A0U(iArr5, iArr4);
        int i6 = 1;
        do {
            A0U(iArr5, iArr5);
            i6++;
        } while (i6 < 50);
        A0Y(iArr5, iArr5, iArr4);
        A0U(iArr6, iArr5);
        int i7 = 1;
        do {
            A0U(iArr6, iArr6);
            i7++;
        } while (i7 < 100);
        A0Y(iArr5, iArr6, iArr5);
        A0U(iArr5, iArr5);
        int i8 = 1;
        do {
            A0U(iArr5, iArr5);
            i8++;
        } while (i8 < 50);
        A0Y(iArr4, iArr5, iArr4);
        A0U(iArr4, iArr4);
        do {
            A0U(iArr4, iArr4);
            i++;
        } while (i < 5);
        A0Y(iArr, iArr4, iArr3);
    }

    public static void A0T(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        iArr[0] = -i;
        iArr[1] = -i2;
        iArr[2] = -i3;
        iArr[3] = -i4;
        iArr[4] = -i5;
        iArr[5] = -i6;
        iArr[6] = -i7;
        iArr[7] = -i8;
        iArr[8] = -i9;
        iArr[9] = -iArr2[9];
    }

    public static void A0U(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = i << 1;
        int i12 = i6 << 1;
        int i13 = i6 * 38;
        int i14 = i8 * 38;
        int i15 = i10 * 38;
        long j = (long) i;
        long j2 = j * j;
        long j3 = (long) i11;
        long j4 = (long) i2;
        long j5 = j3 * j4;
        long j6 = (long) i3;
        long j7 = j3 * j6;
        long j8 = (long) i4;
        long j9 = j3 * j8;
        long j10 = (long) i5;
        long j11 = j3 * j10;
        long j12 = (long) i6;
        long j13 = j3 * j12;
        long j14 = (long) i7;
        long j15 = j3 * j14;
        long j16 = (long) i8;
        long j17 = j3 * j16;
        long j18 = (long) i9;
        long j19 = j3 * j18;
        long j20 = (long) i10;
        long j21 = j3 * j20;
        long j22 = (long) (i2 << 1);
        long j23 = j4 * j22;
        long j24 = j22 * j6;
        long j25 = (long) (i4 << 1);
        long j26 = j22 * j25;
        long j27 = j22 * j10;
        long j28 = (long) i12;
        long j29 = j22 * j28;
        long j30 = j22 * j14;
        long j31 = (long) (i8 << 1);
        long j32 = j22 * j31;
        long j33 = j22 * j18;
        long j34 = (long) i15;
        long j35 = j6 * j6;
        long j36 = (long) (i3 << 1);
        long j37 = j36 * j8;
        long j38 = j36 * j10;
        long j39 = j36 * j12;
        long j40 = j36 * j14;
        long j41 = j36 * j16;
        long j42 = (long) (i9 * 19);
        long j43 = j36 * j42;
        long j44 = j6 * j34;
        long j45 = j8 * j25;
        long j46 = j25 * j10;
        long j47 = j25 * j28;
        long j48 = j25 * j14;
        long j49 = (long) i14;
        long j50 = j25 * j49;
        long j51 = j25 * j42;
        long j52 = j10 * j10;
        long j53 = (long) (i5 << 1);
        long j54 = j53 * j12;
        long j55 = (long) (i7 * 19);
        long j56 = j53 * j55;
        long j57 = j10 * j49;
        long j58 = j53 * j42;
        long j59 = j10 * j34;
        long j60 = ((long) i13) * j12;
        long j61 = j28 * j55;
        long j62 = j28 * j49;
        long j63 = j28 * j42;
        long j64 = j55 * j14;
        long j65 = j14 * j49;
        long j66 = ((long) (i7 << 1)) * j42;
        long j67 = j14 * j34;
        long j68 = j16 * j49;
        long j69 = j18 * j34;
        long j70 = j2 + (j22 * j34) + j43 + j50 + j56 + j60;
        long j71 = j11 + j26 + j35 + (j28 * j34) + j66 + j68;
        long j72 = j13 + j27 + j37 + j67 + (j31 * j42);
        long j73 = (j70 + 33554432) >> 26;
        long j74 = j5 + j44 + j51 + j57 + j61 + j73;
        long j75 = j70 - (j73 << 26);
        long j76 = (j71 + 33554432) >> 26;
        long j77 = j72 + j76;
        long j78 = j71 - (j76 << 26);
        long j79 = (j74 + 16777216) >> 25;
        long j80 = j7 + j23 + (j25 * j34) + j58 + j62 + j64 + j79;
        long j81 = j74 - (j79 << 25);
        long j82 = (j77 + 16777216) >> 25;
        long j83 = j15 + j29 + j38 + j45 + (j31 * j34) + (j42 * j18) + j82;
        long j84 = j77 - (j82 << 25);
        long j85 = (j80 + 33554432) >> 26;
        long j86 = j9 + j24 + j59 + j63 + j65 + j85;
        long j87 = j80 - (j85 << 26);
        long j88 = (j83 + 33554432) >> 26;
        long j89 = j17 + j30 + j39 + j46 + j69 + j88;
        long j90 = j83 - (j88 << 26);
        long j91 = (j86 + 16777216) >> 25;
        long j92 = j78 + j91;
        long j93 = j86 - (j91 << 25);
        long j94 = (j89 + 16777216) >> 25;
        long j95 = j19 + j32 + j40 + j47 + j52 + (j34 * j20) + j94;
        long j96 = j89 - (j94 << 25);
        long j97 = (j92 + 33554432) >> 26;
        long j98 = j84 + j97;
        long j99 = j92 - (j97 << 26);
        long j100 = (j95 + 33554432) >> 26;
        long j101 = j21 + j33 + j41 + j48 + j54 + j100;
        long j102 = j95 - (j100 << 26);
        long j103 = (j101 + 16777216) >> 25;
        long j104 = (19 * j103) + j75;
        long j105 = (j104 + 33554432) >> 26;
        iArr[0] = (int) (j104 - (j105 << 26));
        iArr[1] = (int) (j81 + j105);
        iArr[2] = (int) j87;
        iArr[3] = (int) j93;
        iArr[4] = (int) j99;
        iArr[5] = (int) j98;
        iArr[6] = (int) j90;
        iArr[7] = (int) j96;
        iArr[8] = (int) j102;
        iArr[9] = (int) (j101 - (j103 << 25));
    }

    public static void A0V(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = i2 ^ i12;
        int i21 = i3 ^ i13;
        int i22 = i4 ^ i14;
        int i23 = i5 ^ i15;
        int i24 = i6 ^ i16;
        int i25 = i7 ^ i17;
        int i26 = i8 ^ i18;
        int i27 = i9 ^ i19;
        int i28 = i10 ^ iArr2[8];
        int i29 = i11 ^ iArr2[9];
        int i30 = -i;
        iArr[0] = i2 ^ (i20 & i30);
        iArr[1] = i3 ^ (i21 & i30);
        iArr[2] = i4 ^ (i22 & i30);
        iArr[3] = i5 ^ (i23 & i30);
        iArr[4] = i6 ^ (i24 & i30);
        iArr[5] = i7 ^ (i25 & i30);
        iArr[6] = i8 ^ (i26 & i30);
        iArr[7] = i9 ^ (i27 & i30);
        iArr[8] = i10 ^ (i28 & i30);
        iArr[9] = i11 ^ (i29 & i30);
    }

    public static void A0W(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = iArr2[8];
        int i21 = iArr2[9];
        int i22 = -i;
        int i23 = (i2 ^ i12) & i22;
        int i24 = (i3 ^ i13) & i22;
        int i25 = (i4 ^ i14) & i22;
        int i26 = (i5 ^ i15) & i22;
        int i27 = (i6 ^ i16) & i22;
        int i28 = (i7 ^ i17) & i22;
        int i29 = (i8 ^ i18) & i22;
        int i30 = (i9 ^ i19) & i22;
        int i31 = (i10 ^ i20) & i22;
        int i32 = (i11 ^ i21) & i22;
        iArr[0] = i2 ^ i23;
        iArr[1] = i3 ^ i24;
        iArr[2] = i4 ^ i25;
        iArr[3] = i5 ^ i26;
        iArr[4] = i6 ^ i27;
        iArr[5] = i7 ^ i28;
        iArr[6] = i8 ^ i29;
        iArr[7] = i9 ^ i30;
        iArr[8] = i10 ^ i31;
        iArr[9] = i11 ^ i32;
        iArr2[0] = i12 ^ i23;
        iArr2[1] = i13 ^ i24;
        iArr2[2] = i14 ^ i25;
        iArr2[3] = i15 ^ i26;
        iArr2[4] = i16 ^ i27;
        iArr2[5] = i17 ^ i28;
        iArr2[6] = i18 ^ i29;
        iArr2[7] = i19 ^ i30;
        iArr2[8] = i20 ^ i31;
        iArr2[9] = i21 ^ i32;
    }

    public static void A0X(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = iArr3[4];
        int i16 = iArr3[5];
        int i17 = iArr3[6];
        int i18 = iArr3[7];
        int i19 = iArr3[8];
        iArr[0] = i + i11;
        iArr[1] = i2 + i12;
        iArr[2] = i3 + i13;
        iArr[3] = i4 + i14;
        iArr[4] = i5 + i15;
        iArr[5] = i6 + i16;
        iArr[6] = i7 + i17;
        iArr[7] = i8 + i18;
        iArr[8] = i9 + i19;
        iArr[9] = i10 + iArr3[9];
    }

    public static void A0Y(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = iArr3[4];
        int i16 = iArr3[5];
        int i17 = iArr3[6];
        int i18 = iArr3[7];
        int i19 = iArr3[8];
        int i20 = iArr3[9];
        int i21 = i12 * 19;
        int i22 = i17 * 19;
        int i23 = i18 * 19;
        int i24 = i20 * 19;
        long j = (long) i;
        long j2 = (long) i11;
        long j3 = j * j2;
        long j4 = (long) i12;
        long j5 = j * j4;
        long j6 = (long) i13;
        long j7 = j * j6;
        long j8 = (long) i14;
        long j9 = j * j8;
        long j10 = (long) i15;
        long j11 = j * j10;
        long j12 = (long) i16;
        long j13 = j * j12;
        long j14 = (long) i17;
        long j15 = j * j14;
        long j16 = (long) i18;
        long j17 = j * j16;
        long j18 = (long) i19;
        long j19 = j * j18;
        long j20 = j * ((long) i20);
        long j21 = (long) i2;
        long j22 = j21 * j2;
        long j23 = (long) (i2 << 1);
        long j24 = j23 * j4;
        long j25 = j21 * j6;
        long j26 = j23 * j8;
        long j27 = j21 * j10;
        long j28 = j23 * j12;
        long j29 = j21 * j14;
        long j30 = j23 * j16;
        long j31 = j21 * j18;
        long j32 = (long) i24;
        long j33 = j23 * j32;
        long j34 = (long) i3;
        long j35 = j34 * j2;
        long j36 = j34 * j4;
        long j37 = j34 * j6;
        long j38 = j34 * j8;
        long j39 = j34 * j10;
        long j40 = j34 * j12;
        long j41 = j34 * j14;
        long j42 = j16 * j34;
        long j43 = (long) (i19 * 19);
        long j44 = j34 * j43;
        long j45 = j34 * j32;
        long j46 = (long) i4;
        long j47 = j46 * j2;
        long j48 = (long) (i4 << 1);
        long j49 = j48 * j4;
        long j50 = j46 * j6;
        long j51 = j48 * j8;
        long j52 = j46 * j10;
        long j53 = j48 * j12;
        long j54 = j14 * j46;
        long j55 = (long) i23;
        long j56 = j48 * j55;
        long j57 = j46 * j43;
        long j58 = j48 * j32;
        long j59 = (long) i5;
        long j60 = j59 * j2;
        long j61 = j59 * j4;
        long j62 = j59 * j6;
        long j63 = j59 * j8;
        long j64 = j59 * j10;
        long j65 = j12 * j59;
        long j66 = (long) i22;
        long j67 = j59 * j66;
        long j68 = j59 * j55;
        long j69 = j59 * j43;
        long j70 = j59 * j32;
        long j71 = (long) i6;
        long j72 = j71 * j2;
        long j73 = (long) (i6 << 1);
        long j74 = j73 * j4;
        long j75 = j71 * j6;
        long j76 = j73 * j8;
        long j77 = j10 * j71;
        long j78 = (long) (i16 * 19);
        long j79 = j73 * j78;
        long j80 = j71 * j66;
        long j81 = j73 * j55;
        long j82 = j71 * j43;
        long j83 = j73 * j32;
        long j84 = (long) i7;
        long j85 = j84 * j2;
        long j86 = j84 * j4;
        long j87 = j84 * j6;
        long j88 = j8 * j84;
        long j89 = (long) (i15 * 19);
        long j90 = j84 * j89;
        long j91 = j84 * j78;
        long j92 = j84 * j66;
        long j93 = j84 * j55;
        long j94 = j84 * j43;
        long j95 = j84 * j32;
        long j96 = (long) i8;
        long j97 = j96 * j2;
        long j98 = (long) (i8 << 1);
        long j99 = j98 * j4;
        long j100 = j6 * j96;
        long j101 = (long) (i14 * 19);
        long j102 = j98 * j101;
        long j103 = j96 * j89;
        long j104 = j98 * j78;
        long j105 = j96 * j66;
        long j106 = j98 * j55;
        long j107 = j96 * j43;
        long j108 = j98 * j32;
        long j109 = (long) i9;
        long j110 = j109 * j2;
        long j111 = j4 * j109;
        long j112 = (long) (i13 * 19);
        long j113 = j109 * j112;
        long j114 = j109 * j101;
        long j115 = j109 * j89;
        long j116 = j109 * j78;
        long j117 = j109 * j66;
        long j118 = j109 * j55;
        long j119 = j109 * j43;
        long j120 = j109 * j32;
        long j121 = (long) i10;
        long j122 = j2 * j121;
        long j123 = (long) (i10 << 1);
        long j124 = j20 + j31 + j42 + j54 + j65 + j77 + j88 + j100 + j111 + j122;
        long[] jArr = {j3 + j33 + j44 + j56 + j67 + j79 + j90 + j102 + j113 + (((long) i21) * j123), j5 + j22 + j45 + j57 + j68 + j80 + j91 + j103 + j114 + (j112 * j121), j7 + j24 + j35 + j58 + j69 + j81 + j92 + j104 + j115 + (j101 * j123), j9 + j25 + j36 + j47 + j70 + j82 + j93 + j105 + j116 + (j89 * j121), j11 + j26 + j37 + j49 + j60 + j83 + j94 + j106 + j117 + (j78 * j123), j13 + j27 + j38 + j50 + j61 + j72 + j95 + j107 + j118 + (j66 * j121), j15 + j28 + j39 + j51 + j62 + j74 + j85 + j108 + j119 + (j55 * j123), j17 + j29 + j40 + j52 + j63 + j75 + j86 + j97 + j120 + (j121 * j43), j19 + j30 + j41 + j53 + j64 + j76 + j87 + j99 + j110 + (j123 * j32), j124};
        long j125 = jArr[0];
        long j126 = jArr[1];
        long j127 = jArr[2];
        long j128 = jArr[3];
        long j129 = jArr[4];
        long j130 = jArr[5];
        long j131 = jArr[6];
        long j132 = jArr[7];
        long j133 = jArr[8];
        long j134 = (j125 + 33554432) >> 26;
        long j135 = j126 + j134;
        long j136 = j125 - (j134 << 26);
        long j137 = (j129 + 33554432) >> 26;
        long j138 = j130 + j137;
        long j139 = j129 - (j137 << 26);
        long j140 = (j135 + 16777216) >> 25;
        long j141 = j127 + j140;
        long j142 = j135 - (j140 << 25);
        long j143 = (j138 + 16777216) >> 25;
        long j144 = j131 + j143;
        long j145 = j138 - (j143 << 25);
        long j146 = (j141 + 33554432) >> 26;
        long j147 = j128 + j146;
        long j148 = j141 - (j146 << 26);
        long j149 = (j144 + 33554432) >> 26;
        long j150 = j132 + j149;
        long j151 = j144 - (j149 << 26);
        long j152 = (j147 + 16777216) >> 25;
        long j153 = j139 + j152;
        long j154 = j147 - (j152 << 25);
        long j155 = (j150 + 16777216) >> 25;
        long j156 = j133 + j155;
        long j157 = j150 - (j155 << 25);
        long j158 = (j153 + 33554432) >> 26;
        long j159 = j145 + j158;
        long j160 = j153 - (j158 << 26);
        long j161 = (j156 + 33554432) >> 26;
        long j162 = j124 + j161;
        long j163 = j156 - (j161 << 26);
        long j164 = (j162 + 16777216) >> 25;
        long j165 = (19 * j164) + j136;
        long j166 = j162 - (j164 << 25);
        long j167 = (j165 + 33554432) >> 26;
        iArr[0] = (int) (j165 - (j167 << 26));
        iArr[1] = (int) (j142 + j167);
        iArr[2] = (int) j148;
        iArr[3] = (int) j154;
        iArr[4] = (int) j160;
        iArr[5] = (int) j159;
        iArr[6] = (int) j151;
        iArr[7] = (int) j157;
        iArr[8] = (int) j163;
        iArr[9] = (int) j166;
    }

    public static void A0Z(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = iArr3[4];
        int i16 = iArr3[5];
        int i17 = iArr3[6];
        int i18 = iArr3[7];
        int i19 = iArr3[8];
        iArr[0] = i - i11;
        iArr[1] = i2 - i12;
        iArr[2] = i3 - i13;
        iArr[3] = i4 - i14;
        iArr[4] = i5 - i15;
        iArr[5] = i6 - i16;
        iArr[6] = i7 - i17;
        iArr[7] = i8 - i18;
        iArr[8] = i9 - i19;
        iArr[9] = i10 - iArr3[9];
    }

    public static boolean A0a(CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 5000;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                z2 = true;
                j = 5000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j <= 0) {
                    break;
                }
            }
        }
        Thread.currentThread().interrupt();
        return z;
    }

    public static byte[] A0b(String str) {
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static byte[] A0c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("UTF-8"));
            return instance.digest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A0d(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A0e(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A0f(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static int[] A0g(int i, int i2) {
        int i3 = 32 / i2;
        int i4 = (int) ((1 << i3) - 1);
        int[] iArr = new int[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[(i2 - i5) - 1] = (i >> (i3 * i5)) & i4;
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            iArr[i6] = iArr[i6] + 1;
        }
        return iArr;
    }

    public static byte[][] A0h(byte[] bArr, int i, int i2) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = new byte[i];
        System.arraycopy(bArr, 0, bArr2[0], 0, i);
        bArr2[1] = new byte[i2];
        System.arraycopy(bArr, i, bArr2[1], 0, i2);
        return bArr2;
    }

    public static byte[][] A0i(byte[] bArr, int i, int i2, int i3) {
        String str;
        if (bArr != null && i2 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                byte[][] bArr2 = new byte[3][];
                bArr2[0] = new byte[i];
                System.arraycopy(bArr, 0, bArr2[0], 0, i);
                bArr2[1] = new byte[i2];
                System.arraycopy(bArr, i, bArr2[1], 0, i2);
                bArr2[2] = new byte[i3];
                System.arraycopy(bArr, i4, bArr2[2], 0, i3);
                return bArr2;
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("Input too small: ");
        if (bArr != null) {
            int length = bArr.length;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i5 = 0; i5 < length; i5++) {
                byte b = bArr[0 + i5];
                stringBuffer.append("(byte)0x");
                char[] cArr = C68343Cv.A00;
                stringBuffer.append(cArr[(b >> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
                stringBuffer.append(", ");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        A0S.append(str);
        throw new ParseException(A0S.toString(), 0);
    }
}
