package X;

import android.accounts.Account;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0fc  reason: invalid class name and case insensitive filesystem */
public class C11040fc extends AnonymousClass0JW {
    public final AnonymousClass02M A00;
    public final AnonymousClass0HQ A01;
    public final AnonymousClass0JJ A02;
    public final C41651vP A03;
    public final AnonymousClass03R A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass00D A06;
    public final C02290Bk A07;
    public final C04600Kz A08 = new C04600Kz("gdrive-activity/one-time-setup");
    public final AnonymousClass0IZ A09;
    public final WeakReference A0A;
    public final Set A0B;
    public final Timer A0C = new Timer("perform-one-time-setup");
    public final AtomicBoolean A0D;
    public final AtomicBoolean A0E;
    public final Account[] A0F;

    public C11040fc(AnonymousClass00G r3, AnonymousClass02M r4, AnonymousClass03R r5, AnonymousClass0IZ r6, AnonymousClass0JJ r7, C02290Bk r8, AnonymousClass00D r9, C41651vP r10, AnonymousClass0HQ r11, RestoreFromBackupActivity restoreFromBackupActivity, Account[] accountArr, Set set, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A05 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A09 = r6;
        this.A02 = r7;
        this.A07 = r8;
        this.A06 = r9;
        this.A03 = r10;
        this.A01 = r11;
        this.A0F = accountArr;
        this.A0B = set;
        this.A0E = atomicBoolean;
        this.A0D = atomicBoolean2;
        this.A0A = new WeakReference(restoreFromBackupActivity);
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        this.A0C.schedule(new AnonymousClass1QZ(this), 30000);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C27511Qh r11 = (C27511Qh) obj;
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A0A.get();
        if (restoreFromBackupActivity != null) {
            AnonymousClass00E.A01();
            AnonymousClass0LW A042 = restoreFromBackupActivity.A04();
            AnonymousClass037 A012 = A042.A0Q.A01("one-time-setup-taking-too-long");
            if (A012 != null) {
                ((DialogFragment) A012).A0r();
            }
            if (AnonymousClass0JJ.A0H(restoreFromBackupActivity)) {
                StringBuilder sb = new StringBuilder("gdrive-activity/one-time-setup background task finished but parent activity has already exited, therefore, stopping the task. Data: ");
                sb.append(r11);
                Log.i(sb.toString());
            } else {
                restoreFromBackupActivity.A09 = r11;
                if (r11 != null) {
                    restoreFromBackupActivity.A0g(22, null);
                    restoreFromBackupActivity.A0i(r11);
                } else {
                    StringBuilder A0S = AnonymousClass008.A0S("gdrive-activity/one-time-setup/num-of-local-backup-files/");
                    C02290Bk r7 = ((AnonymousClass0GE) restoreFromBackupActivity).A0E;
                    A0S.append(r7.A06());
                    Log.i(A0S.toString());
                    if (r7.A06() <= 0 || !restoreFromBackupActivity.A0r.get()) {
                        boolean z = ((ActivityC004702f) restoreFromBackupActivity).A0J.A00.getBoolean("new_jid", false);
                        AnonymousClass008.A1H("gdrive-util/is-new-jid/", z);
                        if (z) {
                            restoreFromBackupActivity.A0d();
                            restoreFromBackupActivity.setResult(1);
                        } else {
                            Log.i("gdrive-activity/one-time-setup user is an existing user but has no google drive backups found and no local backups exist either, warn the user.");
                            r7.A00 = 4;
                            Bundle A013 = AnonymousClass008.A01("dialog_id", 14);
                            AnonymousClass01X r8 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                            A013.putString("message", r8.A06(R.string.gdrive_no_google_account_found_message));
                            A013.putBoolean("cancelable", false);
                            A013.putString("positive_button", r8.A06(R.string.gdrive_give_permission_button_label));
                            A013.putString("negative_button", r8.A06(R.string.skip));
                            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                            promptDialogFragment.A0N(A013);
                            if (!AnonymousClass0JJ.A0H(restoreFromBackupActivity)) {
                                if (A042 != null) {
                                    AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                                    r0.A0A(0, promptDialogFragment, null, 1);
                                    r0.A01();
                                } else {
                                    throw null;
                                }
                            }
                        }
                    } else {
                        Log.i("gdrive-activity/one-time-setup no google drive backups found but local backup exists.");
                        r7.A00 = 3;
                        restoreFromBackupActivity.A0g(23, null);
                        restoreFromBackupActivity.A0c();
                    }
                }
            }
        }
        AnonymousClass02M r9 = this.A00;
        Locale locale = Locale.ENGLISH;
        C04600Kz r6 = this.A08;
        String.format(locale, "Load time: %.2f seconds", Double.valueOf(((double) r6.A00()) / 1000.0d));
        if (r9 != null) {
            r6.A01();
            this.A0C.cancel();
            return;
        }
        throw null;
    }
}
