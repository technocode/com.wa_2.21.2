package X;

/* JADX WARN: Init of enum A0F can be incorrect */
/* JADX WARN: Init of enum A07 can be incorrect */
/* JADX WARN: Init of enum A05 can be incorrect */
/* JADX WARN: Init of enum A04 can be incorrect */
/* JADX WARN: Init of enum A02 can be incorrect */
/* JADX WARN: Init of enum A0C can be incorrect */
/* JADX WARN: Init of enum A08 can be incorrect */
/* JADX WARN: Init of enum A0E can be incorrect */
/* JADX WARN: Init of enum A06 can be incorrect */
/* JADX WARN: Init of enum A01 can be incorrect */
/* JADX WARN: Init of enum A09 can be incorrect */
/* JADX WARN: Init of enum A0B can be incorrect */
/* JADX WARN: Init of enum A0D can be incorrect */
/* JADX WARN: Init of enum A03 can be incorrect */
/* JADX WARN: Init of enum A0A can be incorrect */
/* JADX WARN: Init of enum A0G can be incorrect */
/* renamed from: X.0Hy  reason: invalid class name and case insensitive filesystem */
public enum EnumC03840Hy {
    REGISTRATION_FULL(AnonymousClass0R8.REGISTRATION, r7, r8, 0),
    INTERACTIVE_FULL(r12, r7, r8, 1),
    INTERACTIVE_DELTA(r12, r17, r8, 2),
    BACKGROUND_FULL(r21, r7, r8, 3),
    BACKGROUND_DELTA(r21, r17, r8, 4),
    NOTIFICATION_CONTACT(r29, r17, r31, 5),
    INTERACTIVE_QUERY(r12, r36, r31, 6),
    NOTIFICATION_SIDELIST(r29, r36, r42, 7),
    INTERACTIVE_DELTA_SIDELIST(r12, r17, r42, 8),
    ADD_QUERY(AnonymousClass0R8.ADD, r36, r31, 9),
    INTERACTIVE_QUERY_DEVICES(r12, r36, r51, 10),
    MESSAGE_QUERY_DEVICES(AnonymousClass0R8.MESSAGE, r36, r51, 11),
    NOTIFICATION_DEVICE(r29, r36, r51, 12),
    BACKGROUND_DEVICE(r21, r36, r51, 13),
    INTERACTIVE_QUERY_PAYMENT(r12, r36, AnonymousClass0R7.PAYMENT, 14),
    VOIP_QUERY_DEVICES(AnonymousClass0R8.VOIP, r36, r51, 15);
    
    public final int code;
    public final AnonymousClass0R8 context;
    public final AnonymousClass0RA mode;
    public final AnonymousClass0R7 scope;

    /* access modifiers changed from: public */
    static {
        AnonymousClass0R7 r42 = AnonymousClass0R7.SIDELIST;
        AnonymousClass0R7 r31 = AnonymousClass0R7.PHONEBOOK;
        AnonymousClass0R8 r29 = AnonymousClass0R8.NOTIFICATION;
        AnonymousClass0R8 r21 = AnonymousClass0R8.BACKGROUND;
        AnonymousClass0RA r7 = AnonymousClass0RA.FULL;
        AnonymousClass0RA r17 = AnonymousClass0RA.DELTA;
        AnonymousClass0R7 r51 = AnonymousClass0R7.DEVICES;
        AnonymousClass0R7 r8 = AnonymousClass0R7.PHONEBOOK_AND_SIDELIST;
        AnonymousClass0R8 r12 = AnonymousClass0R8.INTERACTIVE;
        AnonymousClass0RA r36 = AnonymousClass0RA.QUERY;
    }

    /* access modifiers changed from: public */
    EnumC03840Hy(AnonymousClass0R8 r3, AnonymousClass0RA r4, AnonymousClass0R7 r5, int i) {
        this.context = r3;
        this.mode = r4;
        this.scope = r5;
        this.code = i;
    }
}
