package X;

import java.util.Map;

/* renamed from: X.1iX  reason: invalid class name and case insensitive filesystem */
public final class C34471iX extends AnonymousClass15J {
    public final Map headerFields;
    public final int responseCode;
    public final String responseMessage;

    public C34471iX(int i, String str, Map map, AnonymousClass15G r5) {
        super(AnonymousClass008.A0F("Response code: ", i), r5);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
    }
}
