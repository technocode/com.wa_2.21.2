package X;

/* renamed from: X.1xT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42901xT {
    public static final /* synthetic */ C42901xT A00 = new C42901xT();

    public static float A00(AnonymousClass06K r0) {
        return AnonymousClass05i.A01(r0.ALz().AQL());
    }

    public static Integer A01(AnonymousClass06K r0) {
        return Integer.valueOf(AnonymousClass05i.A03(r0.ALz().AQL()));
    }

    public static Integer A02(AnonymousClass06K r2) {
        int i;
        String AQL = r2.ALz().AQL();
        int hashCode = AQL.hashCode();
        if (hashCode == -1364013995) {
            if (AQL.equals("center")) {
                i = 1;
            }
            throw new AnonymousClass060(AnonymousClass008.A0K("can't parse unknown textAlign: ", AQL));
        } else if (hashCode != 100571) {
            if (hashCode == 109757538 && AQL.equals("start")) {
                i = 8388611;
            }
            throw new AnonymousClass060(AnonymousClass008.A0K("can't parse unknown textAlign: ", AQL));
        } else {
            if (AQL.equals("end")) {
                i = 8388613;
            }
            throw new AnonymousClass060(AnonymousClass008.A0K("can't parse unknown textAlign: ", AQL));
        }
        return Integer.valueOf(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 2962
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public final java.lang.Object A03(X.AnonymousClass06K r27, X.AnonymousClass06P r28) {
        /*
        // Method dump skipped, instructions count: 12268
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42901xT.A03(X.06K, X.06P):java.lang.Object");
    }
}
