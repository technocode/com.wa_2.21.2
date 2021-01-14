package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* renamed from: X.2Vm  reason: invalid class name and case insensitive filesystem */
public class C50642Vm {
    public int A00;
    public int A01;
    public ArrayList A02;
    public Map A03;

    public C50642Vm() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = new ArrayList();
    }

    public C50642Vm(byte[] bArr) {
        int length = bArr.length;
        this.A03 = new HashMap();
        int i = 0;
        this.A01 = 0;
        this.A00 = 0;
        ArrayList arrayList = new ArrayList();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (i < length) {
            short s = wrap.getShort();
            byte[] bArr2 = new byte[2];
            wrap.get(bArr2);
            int A0F = C28051Sr.A0F(bArr2);
            byte[] bArr3 = new byte[A0F];
            wrap.get(bArr3);
            arrayList.add(new C50632Vl(s, bArr3));
            this.A03.put(Short.valueOf(s), Integer.valueOf(this.A00));
            this.A00++;
            i += A0F + 4;
        }
        if (i == length) {
            this.A01 = i;
            this.A02 = new ArrayList();
            this.A02 = new ArrayList(arrayList);
            return;
        }
        throw new C29001Wo((byte) 80, new SSLException("Error while parsing extension"));
    }

    public C50632Vl A00(short s) {
        int intValue;
        Number number = (Number) this.A03.get(Short.valueOf(s));
        if (number == null || (intValue = number.intValue()) >= this.A00) {
            return null;
        }
        return (C50632Vl) this.A02.get(intValue);
    }

    public void A01(C50632Vl r4) {
        ArrayList arrayList = this.A02;
        int i = this.A00;
        arrayList.add(i, r4);
        this.A01 += r4.A01.length + 4;
        this.A00 = i + 1;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("extensions{extensions=");
        A0S.append(Arrays.toString(this.A02.toArray()));
        A0S.append(", idx=");
        A0S.append(this.A00);
        A0S.append(", totalNetworkBytes=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
