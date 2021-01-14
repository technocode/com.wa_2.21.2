package X;

/* renamed from: X.1Ex  reason: invalid class name */
public final class AnonymousClass1Ex extends Exception {
    public final int errorCode;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r1.equals("invalid_parameters") != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1.equals("missing_to") != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1Ex(java.lang.String r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            r2 = 0
            if (r4 == 0) goto L_0x0013
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r4.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1743242157: goto L_0x003e;
                case -1290953729: goto L_0x0033;
                case -920906446: goto L_0x0029;
                case -617027085: goto L_0x001f;
                case -95047692: goto L_0x0016;
                default: goto L_0x0013;
            }
        L_0x0013:
            r3.errorCode = r2
            return
        L_0x0016:
            java.lang.String r0 = "missing_to"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            goto L_0x0031
        L_0x001f:
            java.lang.String r0 = "messagetoobig"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 2
            goto L_0x0013
        L_0x0029:
            java.lang.String r0 = "invalid_parameters"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
        L_0x0031:
            r2 = 1
            goto L_0x0013
        L_0x0033:
            java.lang.String r0 = "toomanymessages"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 4
            goto L_0x0013
        L_0x003e:
            java.lang.String r0 = "service_not_available"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 3
            goto L_0x0013
            switch-data {-1743242157->0x003e, -1290953729->0x0033, -920906446->0x0029, -617027085->0x001f, -95047692->0x0016, }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Ex.<init>(java.lang.String):void");
    }
}
