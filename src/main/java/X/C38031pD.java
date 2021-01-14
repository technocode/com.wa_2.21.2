package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: X.1pD  reason: invalid class name and case insensitive filesystem */
public class C38031pD implements AnonymousClass06N {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    public C38031pD(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        this.A02 = peek;
        int i = C25351Gn.A00[peek.ordinal()];
        if (i == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
        } else if (i == 2) {
            jsonReader.nextNull();
        } else if (i == 3 || i == 4) {
            this.A01 = jsonReader.nextString();
        } else {
            throw new IllegalStateException("can't read value");
        }
    }

    @Override // X.AnonymousClass06N
    public boolean A2L() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        StringBuilder A0S = AnonymousClass008.A0S("type mis matching");
        A0S.append(this.A02);
        throw new IOException(A0S.toString());
    }

    @Override // X.AnonymousClass06N
    public double A3t() {
        String str = this.A01;
        if (str != null) {
            return Double.valueOf(str).doubleValue();
        }
        StringBuilder A0S = AnonymousClass008.A0S("type mis matching");
        A0S.append(this.A02);
        throw new IOException(A0S.toString());
    }

    @Override // X.AnonymousClass06N
    public int AAq() {
        String str = this.A01;
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        StringBuilder A0S = AnonymousClass008.A0S("type mis matching");
        A0S.append(this.A02);
        throw new IOException(A0S.toString());
    }

    @Override // X.AnonymousClass06N
    public boolean ABL() {
        return this.A02 == JsonToken.NULL;
    }

    @Override // X.AnonymousClass06N
    public long ABp() {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        StringBuilder A0S = AnonymousClass008.A0S("type mis matching");
        A0S.append(this.A02);
        throw new IOException(A0S.toString());
    }

    @Override // X.AnonymousClass06N
    public Number ACW() {
        String str = this.A01;
        if (str != null) {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(this.A01);
            }
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("type mis matching");
            A0S.append(this.A02);
            throw new IOException(A0S.toString());
        }
    }

    @Override // X.AnonymousClass06N
    public String AQL() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        StringBuilder A0S = AnonymousClass008.A0S("type mis matching");
        A0S.append(this.A02);
        throw new IOException(A0S.toString());
    }
}
