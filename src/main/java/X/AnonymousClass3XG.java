package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3XG  reason: invalid class name */
public class AnonymousClass3XG {
    public int A00 = 0;
    public String A01;
    public String A02 = "UTF-8";
    public String A03 = "UTF-8";
    public List A04 = new ArrayList();
    public C68373Cy A05;
    public AnonymousClass3D0 A06;

    public void A00(String str) {
        String str2 = this.A01;
        if (str2 == null || str2.equalsIgnoreCase("TYPE")) {
            this.A05.A04.add(str);
        } else {
            this.A05.A00.put(str2, str);
        }
        this.A01 = null;
    }

    public void A01(List list) {
        byte[] bArr;
        byte[] bArr2;
        String str = "";
        if (list == null || list.size() == 0) {
            C68373Cy r2 = this.A05;
            r2.A06 = null;
            r2.A03.clear();
            this.A05.A03.add(str);
            this.A05.A02 = str;
            return;
        }
        String asString = this.A05.A00.getAsString("ENCODING");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C68373Cy r9 = this.A05;
            List list2 = r9.A03;
            if (asString != null) {
                if (asString.equals("BASE64") || asString.equals("B")) {
                    r9.A06 = Base64.decode(str2.getBytes(), 0);
                    list2.add(str2);
                } else if (asString.equals("QUOTED-PRINTABLE")) {
                    String replaceAll = str2.replaceAll("= ", " ").replaceAll("=\t", "\t");
                    StringBuilder sb = new StringBuilder();
                    int length = replaceAll.length();
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (i < length) {
                        char charAt = replaceAll.charAt(i);
                        if (charAt == '\n') {
                            arrayList.add(sb.toString());
                            sb = new StringBuilder();
                        } else if (charAt == '\r') {
                            arrayList.add(sb.toString());
                            sb = new StringBuilder();
                            if (i < length - 1) {
                                int i2 = i + 1;
                                if (replaceAll.charAt(i2) == '\n') {
                                    i = i2;
                                }
                            }
                        } else {
                            sb.append(charAt);
                        }
                        i++;
                    }
                    String obj = sb.toString();
                    if (obj.length() > 0) {
                        arrayList.add(obj);
                    }
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    StringBuilder sb2 = new StringBuilder();
                    for (String str3 : strArr) {
                        if (str3.endsWith("=")) {
                            str3 = str3.substring(0, str3.length() - 1);
                        }
                        sb2.append(str3);
                    }
                    try {
                        bArr = sb2.toString().getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        StringBuilder A0S = AnonymousClass008.A0S("Failed to encode: charset=");
                        A0S.append("UTF-8");
                        Log.e(A0S.toString(), e);
                        bArr = sb2.toString().getBytes();
                    }
                    if (bArr == null) {
                        bArr2 = null;
                    } else {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            int i3 = 0;
                            while (i3 < bArr.length) {
                                byte b = bArr[i3];
                                if (b == 61) {
                                    int i4 = i3 + 1;
                                    try {
                                        byte b2 = bArr[i4];
                                        int digit = Character.digit((char) b2, 16);
                                        if (digit != -1) {
                                            i3 = i4 + 1;
                                            byte b3 = bArr[i3];
                                            int digit2 = Character.digit((char) b3, 16);
                                            if (digit2 != -1) {
                                                byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                                            } else {
                                                throw new C68383Cz(AnonymousClass008.A0F("Invalid URL encoding: not a valid digit (radix 16): ", b3));
                                            }
                                        } else {
                                            throw new C68383Cz(AnonymousClass008.A0F("Invalid URL encoding: not a valid digit (radix 16): ", b2));
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e2) {
                                        throw new C68383Cz(e2);
                                    }
                                } else {
                                    byteArrayOutputStream.write(b);
                                }
                                i3++;
                            }
                            bArr2 = byteArrayOutputStream.toByteArray();
                        } catch (C68383Cz e3) {
                            Log.e("Failed to decode quoted-printable: ", e3);
                            str2 = str;
                        }
                    }
                    try {
                        str2 = new String(bArr2, "UTF-8");
                    } catch (UnsupportedEncodingException e4) {
                        Log.e("Failed to encode: charset=UTF-8", e4);
                        str2 = new String(bArr2);
                    }
                    list2.add(str2);
                }
            }
            if (!"UTF-8".equalsIgnoreCase("UTF-8")) {
                ByteBuffer encode = Charset.forName("UTF-8").encode(str2);
                byte[] bArr3 = new byte[encode.remaining()];
                encode.get(bArr3);
                try {
                    str2 = new String(bArr3, "UTF-8");
                } catch (UnsupportedEncodingException e5) {
                    Log.e("Failed to encode: charset=UTF-8", e5);
                    str2 = new String(bArr3);
                }
            }
            list2.add(str2);
        }
        C68373Cy r5 = this.A05;
        List<String> list3 = r5.A03;
        int size = list3.size();
        if (size > 1) {
            StringBuilder sb3 = new StringBuilder();
            for (String str4 : list3) {
                sb3.append(str4);
                sb3.append(";");
            }
            int length2 = sb3.length();
            if (length2 > 0) {
                int i5 = length2 - 1;
                if (sb3.charAt(i5) == ';') {
                    str = sb3.substring(0, i5);
                }
            }
            str = sb3.toString();
        } else if (size == 1) {
            str = (String) list3.get(0);
        }
        r5.A02 = str;
    }
}
