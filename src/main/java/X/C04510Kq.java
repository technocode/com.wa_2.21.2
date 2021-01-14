package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0Kq  reason: invalid class name and case insensitive filesystem */
public class C04510Kq {
    public static volatile C04510Kq A08;
    public final AnonymousClass0GG A00;
    public final AnonymousClass01I A01;
    public final C03490Gl A02;
    public final AnonymousClass0I4 A03;
    public final AnonymousClass0ES A04;
    public final AnonymousClass0EQ A05;
    public final AnonymousClass00D A06;
    public final AnonymousClass0AR A07;

    public C04510Kq(C03490Gl r1, AnonymousClass01I r2, AnonymousClass0AR r3, AnonymousClass0GG r4, AnonymousClass0EQ r5, AnonymousClass0ES r6, AnonymousClass00D r7, AnonymousClass0I4 r8) {
        this.A02 = r1;
        this.A01 = r2;
        this.A07 = r3;
        this.A00 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A06 = r7;
        this.A03 = r8;
    }

    public static C04510Kq A00() {
        if (A08 == null) {
            synchronized (C04510Kq.class) {
                if (A08 == null) {
                    A08 = new C04510Kq(C03490Gl.A00(), AnonymousClass01I.A00(), AnonymousClass0AR.A00(), AnonymousClass0GG.A00(), AnonymousClass0EQ.A00(), AnonymousClass0ES.A00(), AnonymousClass00D.A00(), AnonymousClass0I4.A00());
                }
            }
        }
        return A08;
    }

    public synchronized void A01(C64522yK r13, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z3 = r13.A05;
        if (z3 || r13.A03 || r13.A04 || r13.A02 || r13.A01) {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountSyncManager/fetchAllAccountInfo/fetch account info: ");
            StringBuilder sb2 = new StringBuilder("AccountSyncRequest:");
            String str5 = "";
            if (z3) {
                str = "S";
            } else {
                str = str5;
            }
            sb2.append(str);
            boolean z4 = r13.A03;
            if (z4) {
                str2 = "Pi";
            } else {
                str2 = str5;
            }
            sb2.append(str2);
            boolean z5 = r13.A04;
            if (z5) {
                str3 = "Pr";
            } else {
                str3 = str5;
            }
            sb2.append(str3);
            boolean z6 = r13.A02;
            if (z6) {
                str4 = "D";
            } else {
                str4 = str5;
            }
            sb2.append(str4);
            boolean z7 = r13.A01;
            if (z7) {
                str5 = "B";
            }
            sb2.append(str5);
            sb.append(sb2.toString());
            Log.i(sb.toString());
            AnonymousClass00D r4 = this.A06;
            AnonymousClass3LC r5 = new AnonymousClass3LC(this, r4, r13, z);
            if (z2) {
                int i = 0;
                if (z3) {
                    int i2 = r4.A00.getInt("account_sync_status_num_retries", 0);
                    if (r13.A00) {
                        int i3 = i2 - 1;
                        if (i2 <= 1) {
                            i3 = 0;
                        }
                        if (i3 == 0) {
                            AnonymousClass008.A0j(r4, "account_sync_status_num_retries");
                        } else {
                            AnonymousClass008.A0k(r4, "account_sync_status_num_retries", i3);
                        }
                    } else {
                        AnonymousClass008.A0k(r4, "account_sync_status_num_retries", 3);
                    }
                }
                if (z4) {
                    int i4 = r4.A00.getInt("account_sync_picture_num_retries", 0);
                    if (r13.A00) {
                        int i5 = i4 - 1;
                        if (i4 <= 1) {
                            i5 = 0;
                        }
                        if (i5 == 0) {
                            AnonymousClass008.A0j(r4, "account_sync_picture_num_retries");
                        } else {
                            AnonymousClass008.A0k(r4, "account_sync_picture_num_retries", i5);
                        }
                    } else {
                        AnonymousClass008.A0k(r4, "account_sync_picture_num_retries", 3);
                    }
                }
                if (z5) {
                    int i6 = r4.A00.getInt("account_sync_privacy_num_retries", 0);
                    if (r13.A00) {
                        int i7 = i6 - 1;
                        if (i6 <= 1) {
                            i7 = 0;
                        }
                        if (i7 == 0) {
                            AnonymousClass008.A0j(r4, "account_sync_privacy_num_retries");
                        } else {
                            AnonymousClass008.A0k(r4, "account_sync_privacy_num_retries", i7);
                        }
                    } else {
                        AnonymousClass008.A0k(r4, "account_sync_privacy_num_retries", 3);
                    }
                }
                if (z7) {
                    int i8 = r4.A00.getInt("account_sync_blocklist_num_retries", 0);
                    if (r13.A00) {
                        if (i8 > 1) {
                            i = i8 - 1;
                        }
                        if (i == 0) {
                            AnonymousClass008.A0j(r4, "account_sync_blocklist_num_retries");
                        } else {
                            AnonymousClass008.A0k(r4, "account_sync_blocklist_num_retries", i);
                        }
                    } else {
                        AnonymousClass008.A0k(r4, "account_sync_blocklist_num_retries", 3);
                    }
                }
            }
            if (z3) {
                this.A02.A02(r5);
            }
            if (z4) {
                AnonymousClass0ES r1 = this.A04;
                AnonymousClass01I r0 = this.A01;
                r0.A04();
                r1.A03(r0.A03, 0, 1, r5);
            }
            if (z5) {
                AnonymousClass0I4 r02 = this.A03;
                new AnonymousClass3LE(r02.A03, new C40401tD(r02, r5)).A00();
            }
            if (z7) {
                this.A00.A0D(r5);
            }
            if (z6) {
                AnonymousClass0EQ r2 = this.A05;
                AnonymousClass01I r03 = this.A01;
                r03.A04();
                r2.A02(new UserJid[]{r03.A03}, 2);
            }
            return;
        }
        if (z) {
            this.A07.A0P("account_sync", null);
        }
    }
}
