package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.078  reason: invalid class name */
public abstract class AnonymousClass078 extends AnonymousClass079 {
    public int A00 = -1;
    public AnonymousClass07A unknownFields = AnonymousClass07A.A04;

    public static AnonymousClass078 A00(AnonymousClass078 r6, AnonymousClass071 r7) {
        AnonymousClass1FL A002 = AnonymousClass1FL.A00();
        try {
            AnonymousClass072 r72 = (AnonymousClass072) r7;
            byte[] bArr = r72.bytes;
            int length = r72.bytes.length;
            C05010Mt r0 = new C05010Mt(bArr, 0, length, true);
            try {
                r0.A04(length);
                AnonymousClass078 A01 = A01(r6, r0, A002);
                try {
                    r0.A0C(0);
                    A06(A01);
                    A06(A01);
                    return A01;
                } catch (C04190Jk e) {
                    e.unfinishedMessage = A01;
                    throw e;
                }
            } catch (C04190Jk e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (C04190Jk e3) {
            throw e3;
        }
    }

    public static AnonymousClass078 A01(AnonymousClass078 r2, C05010Mt r3, AnonymousClass1FL r4) {
        AnonymousClass078 r1 = (AnonymousClass078) r2.A0H(EnumC04960Mn.NEW_MUTABLE_INSTANCE, null, null);
        try {
            r1.A0H(EnumC04960Mn.MERGE_FROM_STREAM, r3, r4);
            r1.A0C();
            return r1;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof C04190Jk) {
                throw e.getCause();
            }
            throw e;
        }
    }

    public static AnonymousClass078 A02(AnonymousClass078 r4, byte[] bArr) {
        AnonymousClass1FL A002 = AnonymousClass1FL.A00();
        try {
            int length = bArr.length;
            C05010Mt r0 = new C05010Mt(bArr, 0, length, false);
            try {
                r0.A04(length);
                AnonymousClass078 A01 = A01(r4, r0, A002);
                try {
                    r0.A0C(0);
                    A06(A01);
                    return A01;
                } catch (C04190Jk e) {
                    e.unfinishedMessage = A01;
                    throw e;
                }
            } catch (C04190Jk e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (C04190Jk e3) {
            throw e3;
        }
    }

    public static AbstractC11330g6 A03(AbstractC11330g6 r2) {
        int size = r2.size();
        int i = size << 1;
        if (size == 0) {
            i = 10;
        }
        return ((C11320g5) r2).ACC(i);
    }

    public static AbstractC04120Jd A04(AbstractC04120Jd r2) {
        int size = r2.size();
        int i = size << 1;
        if (size == 0) {
            i = 10;
        }
        return r2.ACC(i);
    }

    public static Object A05(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            } else if (cause instanceof Error) {
                throw cause;
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static void A06(AnonymousClass078 r2) {
        if (!r2.A0F()) {
            C04190Jk r0 = new C04190Jk(new AnonymousClass1FV().getMessage());
            r0.unfinishedMessage = r2;
            throw r0;
        }
    }

    public final AbstractC37151nd A0A() {
        return (AbstractC37151nd) A0H(EnumC04960Mn.GET_PARSER, null, null);
    }

    /* renamed from: A0B */
    public final AbstractC04160Jh AQb() {
        AbstractC04160Jh r2 = (AbstractC04160Jh) A0H(EnumC04960Mn.NEW_BUILDER, null, null);
        r2.A02();
        r2.A00.A0E(C04980Mp.A00, this);
        return r2;
    }

    public void A0C() {
        A0H(EnumC04960Mn.MAKE_IMMUTABLE, null, null);
        this.unknownFields.A01 = false;
    }

    public void A0D(int i, int i2) {
        AnonymousClass07A r4 = this.unknownFields;
        if (r4 == AnonymousClass07A.A04) {
            r4 = new AnonymousClass07A(0, new int[8], new Object[8], true);
            this.unknownFields = r4;
        }
        if (r4.A01) {
            r4.A01((i << 3) | 0, Long.valueOf((long) i2));
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void A0E(AbstractC05000Mr r3, AnonymousClass078 r4) {
        A0H(EnumC04960Mn.VISIT, r3, r4);
        this.unknownFields = r3.ARI(this.unknownFields, r4.unknownFields);
    }

    public final boolean A0F() {
        return A0H(EnumC04960Mn.IS_INITIALIZED, Boolean.TRUE, null) != null;
    }

    public boolean A0G(int i, C05010Mt r7) {
        if ((i & 7) == 4) {
            return false;
        }
        AnonymousClass07A r4 = this.unknownFields;
        if (r4 == AnonymousClass07A.A04) {
            r4 = new AnonymousClass07A(0, new int[8], new Object[8], true);
            this.unknownFields = r4;
        }
        return r4.A03(i, r7);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 7132
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public java.lang.Object A0H(X.EnumC04960Mn r25, java.lang.Object r26, java.lang.Object r27) {
        /*
        // Method dump skipped, instructions count: 26434
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass078.A0H(X.0Mn, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // X.AnonymousClass077
    public /* bridge */ /* synthetic */ AnonymousClass076 A61() {
        return (AnonymousClass079) A0H(EnumC04960Mn.GET_DEFAULT_INSTANCE, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!A0H(EnumC04960Mn.GET_DEFAULT_INSTANCE, null, null).getClass().isInstance(obj)) {
            return false;
        }
        try {
            A0E(C37171nf.A01, (AnonymousClass078) obj);
            return true;
        } catch (AnonymousClass1FN unused) {
            return false;
        }
    }

    public int hashCode() {
        int i = super.A00;
        if (i != 0) {
            return i;
        }
        C37181ng r0 = new C37181ng();
        A0E(r0, this);
        int i2 = r0.A00;
        super.A00 = i2;
        return i2;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder("# ");
        sb.append(obj);
        C008805h.A19(this, sb, 0);
        return sb.toString();
    }
}
