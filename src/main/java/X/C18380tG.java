package X;

import java.security.Provider;

/* renamed from: X.0tG  reason: invalid class name and case insensitive filesystem */
public final class C18380tG extends Provider {
    public C18380tG() {
        super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
        put("SecureRandom.SHA1PRNG", C18370tF.class.getName());
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
}
