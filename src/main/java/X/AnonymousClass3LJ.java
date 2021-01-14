package X;

/* renamed from: X.3LJ  reason: invalid class name */
public class AnonymousClass3LJ extends C64392y7 {
    public final EnumC449722j A00;

    public AnonymousClass3LJ(AnonymousClass0ZH r6, boolean z) {
        super(z);
        super.A00 = 16;
        C007303n r4 = r6.A0n;
        this.A0E = r4.A01;
        this.A0A = r4.A00;
        this.A08 = r6.A0E / 1000;
        this.A0L = r4.A02;
        this.A00 = A04(r6.A0x());
    }

    public static EnumC449722j A04(int i) {
        if (i == 0) {
            return EnumC449722j.CALL_MISSED_VOICE;
        }
        if (i == 1) {
            return EnumC449722j.CALL_MISSED_VIDEO;
        }
        if (i == 2) {
            return EnumC449722j.CALL_MISSED_GROUP_VOICE;
        }
        if (i == 3) {
            return EnumC449722j.CALL_MISSED_GROUP_VIDEO;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("unexpected missed call type ", i));
    }
}
