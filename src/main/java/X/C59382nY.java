package X;

import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2nY  reason: invalid class name and case insensitive filesystem */
public class C59382nY extends AbstractC41421v1 {
    public int A00;
    public int A01;
    public long A02 = -1;
    public boolean A03;
    public final /* synthetic */ ConversationsFragment A04;

    public C59382nY(ConversationsFragment conversationsFragment) {
        this.A04 = conversationsFragment;
    }

    public final void A00(int i, String str, String str2, int i2, boolean z) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            ActivityC004902h A0A = conversationsFragment.A0A();
            if (A0A == null) {
                Log.d("conversations-gdrive-observer/set-message/activity-is-null");
                return;
            }
            if (i == 1) {
                if (this.A00 != 1 && !A0A.isFinishing()) {
                    AnonymousClass02M r2 = conversationsFragment.A0d;
                    r2.A02.post(new RunnableEBaseShape9S0100000_I1_4(this, 13));
                    this.A00 = 1;
                }
                if (!A0A.isFinishing()) {
                    AnonymousClass02M r22 = conversationsFragment.A0d;
                    r22.A02.post(new RunnableEBaseShape1S2100000_I1(this, str2, str, 3));
                }
            } else if (i == 2) {
                throw new IllegalStateException("unexpected state");
            } else if (i != 3) {
                if (i == 4) {
                    if (str2 != null) {
                        if (this.A00 != 4) {
                            Log.i("conversations-gdrive-observer/set-message/show-indeterminate");
                            if (!A0A.isFinishing()) {
                                StringBuilder A0S = AnonymousClass008.A0S("conversations-gdrive-observer/progress-bar-state-change ");
                                A0S.append(this.A00);
                                A0S.append(" -> ");
                                A0S.append(4);
                                Log.d(A0S.toString());
                                AnonymousClass02M r23 = conversationsFragment.A0d;
                                r23.A02.post(new RunnableEBaseShape9S0100000_I1_4(this, 14));
                                this.A00 = 4;
                            }
                        }
                        if (!A0A.isFinishing()) {
                            AnonymousClass02M r24 = conversationsFragment.A0d;
                            r24.A02.post(new RunnableEBaseShape1S2100000_I1(this, str2, str, 4));
                        }
                    } else {
                        throw null;
                    }
                }
            } else if (str2 != null) {
                if (this.A00 != 3 && !A0A.isFinishing()) {
                    AnonymousClass02M r25 = conversationsFragment.A0d;
                    r25.A02.post(new RunnableEBaseShape9S0100000_I1_4(this, 15));
                    this.A00 = 3;
                }
                if (!A0A.isFinishing()) {
                    AnonymousClass02M r0 = conversationsFragment.A0d;
                    r0.A02.post(new AnonymousClass2JQ(this, str2, i2, str));
                }
            } else {
                throw null;
            }
            if (z != this.A03 && !A0A.isFinishing()) {
                StringBuilder A0S2 = AnonymousClass008.A0S("conversations-gdrive-observer/set-message animation: ");
                A0S2.append(this.A03);
                A0S2.append(" -> ");
                A0S2.append(z);
                Log.d(A0S2.toString());
                AnonymousClass02M r26 = conversationsFragment.A0d;
                r26.A02.post(new RunnableEBaseShape1S0110000_I1(this, z, 9));
                this.A03 = z;
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void AFi(int i, Bundle bundle) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            this.A01 = 2;
            if (i != 10) {
                StringBuilder A0S = AnonymousClass008.A0S("conversations-gdrive-observer/error-during-restore/");
                A0S.append(AnonymousClass0JJ.A05(i));
                Log.i(A0S.toString());
                AnonymousClass01X r1 = conversationsFragment.A19;
                A00(1, r1.A06(R.string.gdrive_media_restore_title_failed), r1.A06(R.string.gdrive_backup_notification_string_finished), 0, false);
                conversationsFragment.A0m.A03();
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void AHY() {
        ActivityC004902h A0A;
        Log.i("conversations-gdrive-observer/restore-cancelled");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U() && (A0A = conversationsFragment.A0A()) != null && !A0A.isFinishing()) {
            conversationsFragment.A0d.A02.post(new RunnableEBaseShape7S0200000_I1_2(this, A0A, 33));
        }
    }

    @Override // X.AbstractC09090cH
    public void AHZ(boolean z, long j, long j2) {
        ActivityC004902h A0A;
        AnonymousClass01X r11;
        String A0D;
        AnonymousClass008.A1H("conversations-gdrive-observer/restore-end ", z);
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U() && (A0A = conversationsFragment.A0A()) != null) {
            this.A01 = 8;
            this.A02 = -1;
            if (j > 0) {
                r11 = conversationsFragment.A19;
                A0D = r11.A0D(R.string.gdrive_media_restore_notification_string_finished_with_failures, C002001d.A1Y(r11, j2 - j), C002001d.A1Y(r11, j));
            } else {
                r11 = conversationsFragment.A19;
                A0D = r11.A0D(R.string.gdrive_media_restore_notification_string_finished_no_failures, C002001d.A1Y(r11, j2));
            }
            if (j2 > 0) {
                A00(3, r11.A06(R.string.gdrive_media_restore_title_finished), A0D, 100, false);
            } else if (j2 == 0) {
                Log.i("conversations-gdrive-observer/restore-end/nothing-to-restore");
                if (!A0A.isFinishing()) {
                    conversationsFragment.A0d.A02.post(new RunnableEBaseShape7S0200000_I1_2(this, A0A, 32));
                }
            } else {
                StringBuilder A0V = AnonymousClass008.A0V("conversations-gdrive-observer/restore-end total: ", j2, " failed: ");
                A0V.append(j);
                A0V.append(" result: ");
                A0V.append(z);
                Log.e(A0V.toString());
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void AHa(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/no-data-connection");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            this.A01 = 4;
            AnonymousClass01X r3 = conversationsFragment.A19;
            String A06 = r3.A06(R.string.gdrive_media_restore_notification_string_paused_for_data_connection);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, r3.A06(R.string.gdrive_media_restore_title_paused), A06, i, false);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHb(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/low-battery");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            this.A01 = 5;
            AnonymousClass01X r3 = conversationsFragment.A19;
            String A06 = r3.A06(R.string.gdrive_media_restore_notification_string_paused_for_battery);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, r3.A06(R.string.gdrive_media_restore_title_paused), A06, i, false);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHc(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/sdcard-missing");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            this.A01 = 7;
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            AnonymousClass01X r1 = conversationsFragment.A19;
            A00(4, r1.A06(R.string.gdrive_media_restore_title_paused), r1.A06(R.string.gdrive_restore_error_sdcard_missing_summary), i, false);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHd(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/sdcard-unmounted");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            this.A01 = 6;
            AnonymousClass01X r3 = conversationsFragment.A19;
            String A06 = r3.A06(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, r3.A06(R.string.gdrive_media_restore_title_paused), A06, i, false);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHe(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/no-wifi");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            this.A01 = 3;
            AnonymousClass01X r3 = conversationsFragment.A19;
            String A06 = r3.A06(R.string.gdrive_media_restore_notification_string_paused_for_wifi);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, r3.A06(R.string.gdrive_media_restore_title_paused), A06, i, false);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHf(int i) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U() && i > 0) {
            this.A01 = 10;
            AnonymousClass01X r8 = conversationsFragment.A19;
            A00(4, r8.A06(R.string.gdrive_media_restore_title_running), r8.A0D(R.string.gdrive_media_restore_notification_string_preparation_message_with_percentage_placeholder, r8.A0H().format(((double) i) / 100.0d)), i, true);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHg() {
        Log.i("conversations-gdrive-observer/restore-start");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U()) {
            this.A01 = 9;
            AnonymousClass01X r1 = conversationsFragment.A19;
            A00(4, r1.A06(R.string.gdrive_media_restore_title_running), r1.A06(R.string.gdrive_media_restore_notification_string_preparation_message), -1, true);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHh(long j, long j2, long j3) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0U() && conversationsFragment.A0A() != null) {
            AnonymousClass01X r11 = conversationsFragment.A19;
            String A1Y = C002001d.A1Y(r11, j);
            if (this.A01 != 1 || !A1Y.equals(C002001d.A1Y(r11, this.A02))) {
                this.A02 = j;
                A00(3, r11.A06(R.string.gdrive_media_restore_title_running), r11.A0D(R.string.gdrive_media_restore_notification_string_no_failures_with_placeholder, A1Y, C002001d.A1Y(r11, j3), r11.A0H().format(((double) j) / ((double) j3))), (int) ((j * 100) / j3), true);
                this.A01 = 1;
            }
        }
    }
}
