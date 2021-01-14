package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.1pC  reason: invalid class name and case insensitive filesystem */
public class C38021pC implements AnonymousClass06K {
    public C38031pD A00;
    public AnonymousClass06M A01;
    public String A02;
    public final JsonReader A03;

    public C38021pC(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }

    @Override // X.AnonymousClass06K
    public AnonymousClass06M ACQ() {
        AnonymousClass06M r0;
        this.A02 = null;
        this.A00 = null;
        JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = C25341Gm.A00;
        switch (iArr[peek.ordinal()]) {
            case 1:
                r0 = AnonymousClass06M.NAME;
                break;
            case 2:
                r0 = AnonymousClass06M.NUMBER;
                break;
            case 3:
                r0 = AnonymousClass06M.NULL;
                break;
            case 4:
                r0 = AnonymousClass06M.START_ARRAY;
                break;
            case 5:
                r0 = AnonymousClass06M.END_ARRAY;
                break;
            case 6:
                r0 = AnonymousClass06M.START_OBJECT;
                break;
            case 7:
                r0 = AnonymousClass06M.END_OBJECT;
                break;
            case 8:
                r0 = AnonymousClass06M.END_DOCUMENT;
                break;
            case 9:
                r0 = AnonymousClass06M.BOOLEAN;
                break;
            case 10:
                r0 = AnonymousClass06M.STRING;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown JsonToken ");
                sb.append(peek);
                throw new IllegalStateException(sb.toString());
        }
        this.A01 = r0;
        switch (iArr[jsonReader.peek().ordinal()]) {
            case 1:
                this.A02 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A00 = new C38031pD(jsonReader);
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw new IllegalStateException("unknown JsonToken ");
        }
        return this.A01;
    }

    @Override // X.AnonymousClass06K
    public String ALx() {
        return this.A02;
    }

    @Override // X.AnonymousClass06K
    public AnonymousClass06M ALy() {
        return this.A01;
    }

    @Override // X.AnonymousClass06K
    public AnonymousClass06N ALz() {
        return this.A00;
    }

    @Override // X.AnonymousClass06K
    public void APz() {
        AnonymousClass06M r4 = AnonymousClass06M.START_OBJECT;
        AnonymousClass06M r3 = AnonymousClass06M.START_ARRAY;
        AnonymousClass06M r0 = this.A01;
        if (r0 == r3 || r0 == r4) {
            int i = 1;
            while (true) {
                AnonymousClass06M ACQ = ACQ();
                if (ACQ == r3 || ACQ == r4) {
                    i++;
                } else if (ACQ == AnonymousClass06M.END_ARRAY || ACQ == AnonymousClass06M.END_OBJECT) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
