package X;

/* renamed from: X.0Js  reason: invalid class name and case insensitive filesystem */
public final class C04270Js {
    public static volatile C04270Js A01;
    public volatile boolean A00;

    public static C04270Js A00() {
        if (A01 == null) {
            synchronized (C04270Js.class) {
                if (A01 == null) {
                    A01 = new C04270Js();
                }
            }
        }
        return A01;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("VoiceNoteRecording{running=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
