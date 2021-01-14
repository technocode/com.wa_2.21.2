package X;

import android.util.Pair;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.List;

/* renamed from: X.1VT  reason: invalid class name */
public class AnonymousClass1VT {
    public static final InetSocketAddress A00;
    public static final InetSocketAddress A01;

    static {
        try {
            A00 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 8, 8}), 53);
            A01 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 4, 4}), 53);
        } catch (UnknownHostException e) {
            throw new Error(e);
        }
    }

    public static Pair A00(byte[] bArr, int i) {
        int length;
        if (i < 0 || i >= (length = bArr.length)) {
            throw new UnknownHostException("offset is outside of the data array");
        }
        int i2 = -1;
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b = bArr[i];
            int i3 = i + 1;
            if (((b >> 6) & 3) != 3) {
                if (b == 0) {
                    break;
                }
                i = i3 + b;
                if (i < length) {
                    try {
                        sb.append(newDecoder.decode(ByteBuffer.wrap(bArr, i3, b)).toString());
                        sb.append(".");
                    } catch (CharacterCodingException unused) {
                        throw new UnknownHostException("failed to parse canonical name");
                    }
                } else {
                    throw new UnknownHostException("failed to parse canonical name");
                }
            } else {
                int i4 = (b & 63) << 8;
                if (i3 < length) {
                    i2 = i4 + bArr[i3];
                } else {
                    throw new UnknownHostException("offset is outside of the data array, when getting a pointer");
                }
            }
        }
        return new Pair(sb, Integer.valueOf(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0258, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0246, code lost:
        if (r2.getMessage().contains("libcore.io.ErrnoException: connect failed: EINVAL") == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0254, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0137 A[Catch:{ InterruptedIOException -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(java.lang.String r22, int r23) {
        /*
        // Method dump skipped, instructions count: 648
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VT.A01(java.lang.String, int):java.util.List");
    }

    public static void A02(String str, int i, C48362Lx r16, byte[] bArr, List list, C48362Lx r19) {
        short length;
        C48352Lw r2 = r19.A01;
        if (r2.A01 != r16.A01.A01) {
            throw new UnknownHostException(AnonymousClass008.A0K("received response with unexpected id while trying to resolve ", str));
        } else if (!r2.A0A) {
            throw new UnknownHostException(AnonymousClass008.A0K("did not receive response from server while trying to resolve ", str));
        } else if (r2.A0B) {
            throw new UnknownHostException(AnonymousClass008.A0K("received truncated response while trying to resolve ", str));
        } else if (r2.A06 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C48342Lv r8 = null;
            int i2 = 0;
            while (true) {
                C48342Lv[] r1 = r19.A02;
                if (i2 < r1.length) {
                    C48342Lv r4 = r1[i2];
                    if (r4.A03 == 1) {
                        short s = r4.A04;
                        if (s == 5) {
                            r8 = r4;
                        } else if (s != 1 && s != 28) {
                            throw new UnknownHostException(AnonymousClass008.A0K("unexpected type returned while trying to resolve ", str));
                        } else if (r4.A04 == 1 && ((short) r4.A05.length) != 4) {
                            throw new UnknownHostException(AnonymousClass008.A0K("unexpected record length returned while trying to resolve ", str));
                        } else if (r4.A04 != 28 || (length = (short) r4.A05.length) == 16) {
                            C48372Ly r11 = r4.A02;
                            StringBuilder sb = new StringBuilder();
                            for (String str2 : r11.A02) {
                                sb.append(str2);
                                sb.append('.');
                            }
                            short s2 = r11.A01;
                            if (s2 != 0) {
                                for (String str3 : C48372Ly.A00(r19.A00, 0 + s2).A02) {
                                    sb.append(str3);
                                    sb.append('.');
                                }
                            }
                            if (sb.length() > 0) {
                                sb.setLength(sb.length() - 1);
                            }
                            list.add(new AnonymousClass1VS(InetAddress.getByAddress(sb.toString(), r4.A05), (((long) r4.A01) * 1000) + currentTimeMillis));
                            list.get(list.size() - 1);
                        } else {
                            StringBuilder A0Z = AnonymousClass008.A0Z("unexpected record length returned while trying to resolve ", str, " ");
                            A0Z.append((int) length);
                            throw new UnknownHostException(A0Z.toString());
                        }
                        i2++;
                    } else {
                        throw new UnknownHostException(AnonymousClass008.A0K("unexpected class returned while trying to resolve ", str));
                    }
                } else if (list.isEmpty() && r8 != null) {
                    Pair A002 = A00(r8.A05, 0);
                    StringBuilder sb2 = (StringBuilder) A002.first;
                    int intValue = ((Number) A002.second).intValue();
                    if (intValue != -1) {
                        sb2.append((CharSequence) A00(bArr, intValue).first);
                    }
                    String obj = sb2.toString();
                    if (!obj.equals(str)) {
                        list.addAll(A01(obj, i + 1));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new UnknownHostException(AnonymousClass008.A0K("error code was set in response while trying to resolve ", str));
        }
    }
}
