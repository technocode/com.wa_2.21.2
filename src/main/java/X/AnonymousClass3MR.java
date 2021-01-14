package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.3MR  reason: invalid class name */
public class AnonymousClass3MR implements AbstractC64942z3 {
    public static volatile AnonymousClass3MR A05;
    public final int A00;
    public final long A01;
    public final AnonymousClass3MM A02;
    public final Random A03 = new Random();
    public final Set A04;

    public AnonymousClass3MR(C64932z2 r6, AnonymousClass3MM r7) {
        this.A02 = r7;
        this.A01 = r6.A01();
        HashSet hashSet = new HashSet();
        for (int i : AbstractC64942z3.A00) {
            hashSet.add(Integer.valueOf(i));
        }
        this.A04 = Collections.unmodifiableSet(hashSet);
        this.A00 = this.A03.nextInt(901) + 100;
    }
}
