package X;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0xH  reason: invalid class name and case insensitive filesystem */
public class C20780xH {
    public C20010vy A00;
    public AnonymousClass251 A01;
    public C20710xA A02;
    public C461228e A03;
    public AbstractC461428g A04;
    public AbstractC461428g A05;
    public AbstractC461428g A06;
    public C20740xD A07;
    public final C20770xG A08;

    public C20780xH(C20770xG r1) {
        this.A08 = r1;
    }

    public AnonymousClass251 A00() {
        AnonymousClass251 r3 = this.A01;
        if (r3 != null) {
            return r3;
        }
        C20770xG r32 = this.A08;
        switch ("legacy".hashCode()) {
            case -1868884870:
                if ("legacy".equals("legacy_default_params")) {
                    C460928b r33 = new C460928b(r32.A01, C20690x8.A00(), r32.A06);
                    this.A01 = r33;
                    return r33;
                }
                break;
            case -404562712:
                if ("legacy".equals("experimental")) {
                    C461328f r34 = new C461328f(C32921fp.A00());
                    this.A01 = r34;
                    return r34;
                }
                break;
            case -402149703:
                if ("legacy".equals("dummy_with_tracking")) {
                    C461128d r35 = new C461128d();
                    this.A01 = r35;
                    return r35;
                }
                break;
            case 95945896:
                if ("legacy".equals("dummy")) {
                    C461028c r36 = new C461028c();
                    this.A01 = r36;
                    return r36;
                }
                break;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            C460928b r37 = new C460928b(r32.A01, r32.A02, r32.A06);
            this.A01 = r37;
            return r37;
        }
        C461028c r38 = new C461028c();
        this.A01 = r38;
        return r38;
    }

    public final AbstractC461428g A01(int i) {
        if (i == 0) {
            AbstractC461428g r0 = this.A06;
            if (r0 != null) {
                return r0;
            }
            try {
                Constructor<?> constructor = Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool").getConstructor(AbstractC19980vv.class, C20790xI.class, AbstractC20800xJ.class);
                C20770xG r1 = this.A08;
                AbstractC461428g r02 = (AbstractC461428g) constructor.newInstance(r1.A01, r1.A04, r1.A07);
                this.A06 = r02;
                return r02;
            } catch (ClassNotFoundException e) {
                C19960vt.A01(e);
                this.A06 = null;
                return null;
            } catch (IllegalAccessException e2) {
                C19960vt.A01(e2);
                this.A06 = null;
                return null;
            } catch (InstantiationException e3) {
                C19960vt.A01(e3);
                this.A06 = null;
                return null;
            } catch (NoSuchMethodException e4) {
                C19960vt.A01(e4);
                this.A06 = null;
                return null;
            } catch (InvocationTargetException e5) {
                C19960vt.A01(e5);
                this.A06 = null;
                return null;
            }
        } else if (i == 1) {
            AbstractC461428g r03 = this.A05;
            if (r03 != null) {
                return r03;
            }
            try {
                Constructor<?> constructor2 = Class.forName("com.facebook.imagepipeline.memory.BufferMemoryChunkPool").getConstructor(AbstractC19980vv.class, C20790xI.class, AbstractC20800xJ.class);
                C20770xG r12 = this.A08;
                AbstractC461428g r04 = (AbstractC461428g) constructor2.newInstance(r12.A01, r12.A04, r12.A07);
                this.A05 = r04;
                return r04;
            } catch (ClassNotFoundException unused) {
                this.A05 = null;
                return null;
            } catch (IllegalAccessException unused2) {
                this.A05 = null;
                return null;
            } catch (InstantiationException unused3) {
                this.A05 = null;
                return null;
            } catch (NoSuchMethodException unused4) {
                this.A05 = null;
                return null;
            } catch (InvocationTargetException unused5) {
                this.A05 = null;
                return null;
            }
        } else if (i == 2) {
            AbstractC461428g r05 = this.A04;
            if (r05 != null) {
                return r05;
            }
            try {
                Constructor<?> constructor3 = Class.forName("com.facebook.imagepipeline.memory.AshmemMemoryChunkPool").getConstructor(AbstractC19980vv.class, C20790xI.class, AbstractC20800xJ.class);
                C20770xG r13 = this.A08;
                AbstractC461428g r06 = (AbstractC461428g) constructor3.newInstance(r13.A01, r13.A04, r13.A07);
                this.A04 = r06;
                return r06;
            } catch (ClassNotFoundException unused6) {
                this.A04 = null;
                return null;
            } catch (IllegalAccessException unused7) {
                this.A04 = null;
                return null;
            } catch (InstantiationException unused8) {
                this.A04 = null;
                return null;
            } catch (NoSuchMethodException unused9) {
                this.A04 = null;
                return null;
            } catch (InvocationTargetException unused10) {
                this.A04 = null;
                return null;
            }
        } else {
            throw new IllegalArgumentException("Invalid MemoryChunkType");
        }
    }
}
