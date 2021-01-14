package X;

/* renamed from: X.05G  reason: invalid class name */
public abstract class AnonymousClass05G extends AnonymousClass05H {
    public static void A00(AnonymousClass015 r3, String str, String str2, String str3) {
        String A0K = AnonymousClass008.A0K("HMAC", str);
        AnonymousClass014 r32 = (AnonymousClass014) r3;
        r32.A00(AnonymousClass008.A0K("Mac.", A0K), str2);
        StringBuilder sb = new StringBuilder("Alg.Alias.Mac.HMAC-");
        sb.append(str);
        r32.A00(sb.toString(), A0K);
        StringBuilder sb2 = new StringBuilder("Alg.Alias.Mac.HMAC/");
        sb2.append(str);
        r32.A00(sb2.toString(), A0K);
        StringBuilder sb3 = new StringBuilder("KeyGenerator.");
        sb3.append(A0K);
        r32.A00(sb3.toString(), str3);
        StringBuilder sb4 = new StringBuilder("Alg.Alias.KeyGenerator.HMAC-");
        sb4.append(str);
        r32.A00(sb4.toString(), A0K);
        StringBuilder sb5 = new StringBuilder("Alg.Alias.KeyGenerator.HMAC/");
        sb5.append(str);
        r32.A00(sb5.toString(), A0K);
    }
}
