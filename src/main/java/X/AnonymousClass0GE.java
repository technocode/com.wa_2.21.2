package X;

import android.accounts.Account;
import android.app.Dialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.Me;
import com.whatsapp.ProfilePhotoReminder;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.accountsync.ProfileActivity;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.0GE  reason: invalid class name */
public abstract class AnonymousClass0GE extends ActivityC004602e {
    public AbstractC07170We A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass01J A03;
    public final AnonymousClass01A A04;
    public final AnonymousClass0HN A05;
    public final AnonymousClass00C A06;
    public final AnonymousClass0BD A07;
    public final C06310Ss A08;
    public final AnonymousClass0DG A09;
    public final AnonymousClass0GW A0A;
    public final AnonymousClass0EP A0B;
    public final C016608y A0C;
    public final AnonymousClass01T A0D;
    public final C02290Bk A0E;
    public final AnonymousClass0I6 A0F;
    public final AnonymousClass094 A0G;
    public final AnonymousClass09E A0H;
    public final AnonymousClass0IX A0I;
    public final AnonymousClass0PB A0J;
    public final AnonymousClass0EO A0K;
    public final C03160Fa A0L;
    public final AnonymousClass0FZ A0M;
    public final AnonymousClass0AR A0N;
    public final AnonymousClass0HM A0O;
    public final C014708f A0P;
    public final AnonymousClass0BB A0Q;
    public final AnonymousClass02J A0R;
    public final AnonymousClass321 A0S;
    public final AnonymousClass0BZ A0T;
    public final AnonymousClass00T A0U;
    public final boolean A0V;

    public AnonymousClass0GE() {
        this(false);
    }

    public AnonymousClass0GE(boolean z) {
        this.A01 = AnonymousClass01I.A00();
        this.A0U = C002101e.A00();
        this.A09 = AnonymousClass0DG.A00();
        this.A0N = AnonymousClass0AR.A00();
        this.A02 = C000300f.A00();
        this.A0H = AnonymousClass09E.A00();
        this.A03 = AnonymousClass01J.A00();
        this.A04 = AnonymousClass01A.A00();
        this.A0B = AnonymousClass0EP.A00();
        this.A0L = C03160Fa.A00();
        this.A07 = AnonymousClass0BD.A00();
        this.A0I = AnonymousClass0IX.A00();
        this.A0K = AnonymousClass0EO.A00();
        this.A0T = AnonymousClass0BZ.A00();
        this.A0R = AnonymousClass02J.A02();
        this.A0Q = AnonymousClass0BB.A00();
        this.A06 = AnonymousClass00C.A00();
        this.A05 = AnonymousClass0HN.A00();
        this.A0E = C02290Bk.A02();
        this.A0M = AnonymousClass0FZ.A00();
        this.A0O = AnonymousClass0HM.A00();
        AnonymousClass01Q.A00();
        this.A0C = C016608y.A01;
        this.A08 = C06310Ss.A00();
        this.A0S = AnonymousClass321.A00();
        this.A0A = AnonymousClass0GW.A00();
        this.A0D = AnonymousClass01T.A00();
        this.A0P = C014708f.A00();
        this.A0F = AnonymousClass0I6.A00();
        this.A0G = AnonymousClass094.A00();
        this.A0J = AnonymousClass0PB.A00();
        this.A0V = z;
    }

    public void A0T() {
        Me A042;
        Intent intent;
        if (this instanceof VoipActivityV2) {
            ContactPickerFragment contactPickerFragment = ((VoipActivityV2) this).A0n;
            if (contactPickerFragment != null) {
                contactPickerFragment.A0s();
            }
        } else if (this instanceof RegisterName) {
            RegisterName registerName = (RegisterName) this;
            if (registerName.getIntent().getExtras() == null || !registerName.getIntent().getBooleanExtra("debug", false)) {
                A042 = registerName.A11.A04();
            } else {
                AnonymousClass01I r0 = registerName.A0N;
                r0.A04();
                Me me = r0.A00;
                if (me != null) {
                    A042 = new Me(me.cc, me.number, ((ActivityC004702f) registerName).A0J.A0G());
                } else {
                    throw null;
                }
            }
            if (A042.jabber_id == null) {
                Log.e("registername/messagestoreverified/missing-params bounce to regphone");
                registerName.A11.A0C(1);
                registerName.A0I(new Intent(registerName, RegisterPhone.class), true);
                return;
            }
            AnonymousClass01I r3 = registerName.A0N;
            r3.A04();
            if (!r3.A07(A042, "me")) {
                registerName.finish();
                return;
            }
            r3.A04();
            r3.A05(A042);
            AnonymousClass00D r6 = ((ActivityC004702f) registerName).A0J;
            ProfilePhotoReminder.A04(r6, registerName.A0R);
            Log.i("registername/set_dirty");
            C03160Fa r1 = registerName.A0s;
            r1.A1V = false;
            registerName.A11.A09();
            r1.A01();
            Log.i("regname/msgstoreverified/group_sync_required");
            ((AnonymousClass0GE) registerName).A0K.A0M(true, true, 3);
            registerName.A00 = SystemClock.uptimeMillis();
            r3.A04();
            AnonymousClass0HR r02 = r3.A01;
            if (r02 != null) {
                registerName.A0B = r02;
                AnonymousClass0ES r2 = registerName.A0P;
                r3.A04();
                r2.A03(r3.A03, 0, 2, null);
                if (r6.A00.getLong("message_store_verified_time", 0) == 0) {
                    AnonymousClass008.A0l(r6, "message_store_verified_time", System.currentTimeMillis());
                }
                registerName.A0a();
                if (registerName.A08 != null) {
                    if (registerName.A0i.A01() != 0) {
                        Log.i("registername/restoredialog/congrats");
                        registerName.A08.A00(2);
                    } else {
                        Log.i("registername/restoredialog/empty-msg-restore");
                        if (!registerName.A0L && registerName.A0S.A07()) {
                            registerName.A0H(new Intent(registerName, GoogleDriveNewUserSetupActivity.class), 15);
                            registerName.A0L = true;
                        }
                        C002001d.A2N(registerName, 103);
                    }
                } else if (registerName.A0f.A02("android.permission.GET_ACCOUNTS") != 0) {
                    Log.i("registername/delay google drive setup due to lack of permissions");
                    r6.A0T(System.currentTimeMillis() + 604800000);
                }
                registerName.A1I.ANF(new RunnableEBaseShape4S0100000_I0_4(registerName, 1));
                return;
            }
            throw null;
        } else if (this instanceof ContactPicker) {
            ContactPickerFragment contactPickerFragment2 = ((ContactPicker) this).A02;
            if (contactPickerFragment2 != null) {
                contactPickerFragment2.A0s();
            }
        } else if (this instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) this;
            if (((AnonymousClass0GE) profileActivity).A0K.A0l) {
                C11050fd r03 = profileActivity.A00;
                if (r03 == null || ((AnonymousClass0JW) r03).A00.getStatus() != AsyncTask.Status.RUNNING) {
                    C11050fd r22 = new C11050fd(profileActivity);
                    profileActivity.A00 = r22;
                    profileActivity.A05.ANC(r22, new Void[0]);
                    return;
                }
                return;
            }
            profileActivity.A0W();
        } else if (this instanceof Main) {
            Main main = (Main) this;
            AnonymousClass01I r04 = ((AnonymousClass0GE) main).A01;
            r04.A04();
            if (r04.A00 == null) {
                if (!main.isFinishing()) {
                    int A012 = main.A0P.A01();
                    if (A012 != 0) {
                        if (A012 != 1) {
                            if (A012 == 2) {
                                Log.i("main/no-me/regname");
                                intent = new Intent(main, RegisterName.class);
                            } else if (A012 == 4) {
                                intent = new Intent(main, VerifySms.class);
                                boolean z = false;
                                if (main.A02.A01.A01() != null) {
                                    z = true;
                                }
                                if (z) {
                                    intent.putExtra("changenumber", true);
                                }
                            } else if (A012 != 5) {
                                if (A012 == 6) {
                                    intent = new Intent(main, DeleteAccountConfirmation.class);
                                } else if (A012 != 7) {
                                    StringBuilder sb = new StringBuilder("main/invalid/registration state=");
                                    sb.append(A012);
                                    sb.append("; default to EULA");
                                    Log.e(sb.toString());
                                    ((AnonymousClass0GE) main).A0O.A0C(0);
                                    intent = new Intent(main, EULA.class);
                                } else {
                                    intent = new Intent(main, VerifyTwoFactorAuth.class);
                                    boolean z2 = false;
                                    if (main.A02.A01.A01() != null) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        intent.putExtra("changenumber", true);
                                    }
                                }
                            }
                        }
                        ((AnonymousClass0GE) main).A0O.A0C(0);
                        intent = new Intent(main, EULA.class);
                    } else {
                        intent = new Intent(main, EULA.class);
                        if (main.getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
                            intent.putExtra("show_registration_first_dlg", true);
                        }
                    }
                    if (main.A01 && !main.isFinishing()) {
                        main.startActivity(intent);
                    }
                    main.finish();
                }
                Log.i("main/me App.me is null, can't proceed.");
            } else if (main.A0P.A01() == 2) {
                Log.i("main/me/regname");
                Intent intent2 = new Intent(main, RegisterName.class);
                if (main.A01 && !main.isFinishing()) {
                    main.startActivity(intent2);
                }
                main.finish();
            } else {
                ((AnonymousClass0GE) main).A0O.A0C(3);
                Log.i("main/verified/setregverified");
                if (((AnonymousClass0GE) main).A0K.A0l) {
                    C40241ss r05 = main.A00;
                    if (r05 == null || ((AnonymousClass0JW) r05).A00.getStatus() != AsyncTask.Status.RUNNING) {
                        C40241ss r23 = new C40241ss(main);
                        main.A00 = r23;
                        main.A08.ANI(r23, new Void[0]);
                        return;
                    }
                    Log.i("main/show dialog sync");
                    if (main.A01) {
                        C002001d.A2O(main, 104);
                        return;
                    }
                    return;
                }
                Log.i("main/messageStoreVerified/gotoActivity");
                Log.i("main/gotoActivity");
                main.A0W();
            }
        }
    }

    public void A0U(AnonymousClass1V1 r17) {
        AnonymousClass01X r11;
        String A0D2;
        if (this instanceof VoipActivityV2) {
            ContactPickerFragment contactPickerFragment = ((VoipActivityV2) this).A0n;
            if (contactPickerFragment != null) {
                contactPickerFragment.A0I.notifyDataSetChanged();
                ContactPickerFragment.A1t = false;
            }
        } else if (this instanceof ContactPicker) {
            ContactPickerFragment contactPickerFragment2 = ((ContactPicker) this).A02;
            if (contactPickerFragment2 != null) {
                contactPickerFragment2.A0I.notifyDataSetChanged();
                ContactPickerFragment.A1t = false;
            }
        } else if (this instanceof RestoreFromBackupActivity) {
            RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this;
            AnonymousClass00E.A01();
            if (restoreFromBackupActivity.A0I) {
                restoreFromBackupActivity.setResult(2);
                restoreFromBackupActivity.finish();
            } else if (restoreFromBackupActivity.A0C.A00 == 26) {
                StringBuilder sb = new StringBuilder("gdrive-activity/after-msgstore-verified/state-is-msgstore-restored/call-ignored ");
                sb.append(r17);
                Log.i(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("gdrive-activity/after-msgstore-verified/");
                sb2.append(r17);
                Log.i(sb2.toString());
                restoreFromBackupActivity.A0g(26, r17);
                int i = r17.A00;
                boolean z = false;
                if (i != 2) {
                    z = true;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                sb3.append(" is unexpected here");
                AnonymousClass00E.A08(z, sb3.toString());
                if (i == 1) {
                    restoreFromBackupActivity.A0Z();
                } else if (i == 5) {
                    AnonymousClass00E.A01();
                    if (!AnonymousClass0JJ.A0H(restoreFromBackupActivity)) {
                        Bundle A012 = AnonymousClass008.A01("dialog_id", 19);
                        AnonymousClass01X r3 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                        A012.putString("message", r3.A06(R.string.gdrive_message_restore_failed_low_on_storage_space));
                        A012.putBoolean("cancelable", false);
                        A012.putString("positive_button", r3.A06(R.string.retry));
                        A012.putString("negative_button", r3.A06(R.string.skip));
                        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                        promptDialogFragment.A0N(A012);
                        AnonymousClass0LW A042 = restoreFromBackupActivity.A04();
                        if (A042 != null) {
                            AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                            r0.A0A(0, promptDialogFragment, null, 1);
                            r0.A01();
                            return;
                        }
                        throw null;
                    }
                } else {
                    C27511Qh r112 = restoreFromBackupActivity.A09;
                    if (r112 == null || !r112.A03) {
                        restoreFromBackupActivity.A0r.set(false);
                        Log.i("gdrive-activity/after-msgstore-verified/failed/unrestorable-local-backup");
                    } else {
                        restoreFromBackupActivity.A0o.add(new Account(r112.A05, "com.google"));
                        StringBuilder sb4 = new StringBuilder("gdrive-activity/after-msgstore-verified/failed/unrestorable-gdrive-backup/");
                        sb4.append(AnonymousClass0JJ.A0B(restoreFromBackupActivity.A09.A05));
                        Log.i(sb4.toString());
                    }
                    if (i == 3) {
                        AnonymousClass00E.A01();
                        if (!AnonymousClass0JJ.A0H(restoreFromBackupActivity)) {
                            Bundle A013 = AnonymousClass008.A01("dialog_id", 20);
                            String[] strArr = (String[]) Collections.unmodifiableSet(((AnonymousClass0GE) restoreFromBackupActivity).A0E.A0Y).toArray(new String[0]);
                            AnonymousClass008.A1U(AnonymousClass008.A0S("gdrive-activity/get-jid-mismatch-message "), Arrays.toString(strArr));
                            int length = strArr.length;
                            if (length == 0) {
                                r11 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                                A0D2 = r11.A06(R.string.gdrive_message_restore_failed_jid_mismatch_no_jid_associated_with_backup_found);
                            } else if (length == 1) {
                                r11 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                                A0D2 = r11.A0D(R.string.gdrive_message_restore_failed_jid_mismatch_one_jid_associated_with_backup_found, C12420i4.A03(((ActivityC004702f) restoreFromBackupActivity).A0J.A0G()), strArr[0]);
                            } else {
                                Arrays.sort(strArr);
                                int i2 = length - 1;
                                String[] strArr2 = new String[i2];
                                String str = strArr[i2];
                                System.arraycopy(strArr, 0, strArr2, 0, i2);
                                r11 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                                A0D2 = r11.A0D(R.string.gdrive_message_restore_failed_jid_mismatch_many_jids_associated_with_backup_found, C12420i4.A03(((ActivityC004702f) restoreFromBackupActivity).A0J.A0G()), C002001d.A1g(r11, false, Arrays.asList(strArr2)), str);
                            }
                            A013.putString("message", A0D2);
                            A013.putBoolean("cancelable", false);
                            A013.putString("positive_button", r11.A06(R.string.gdrive_message_restore_failed_reregister_btn));
                            boolean A0n = restoreFromBackupActivity.A0n();
                            int i3 = R.string.skip;
                            if (A0n) {
                                i3 = R.string.restore_from_older;
                            }
                            A013.putString("negative_button", r11.A06(i3));
                            PromptDialogFragment promptDialogFragment2 = new PromptDialogFragment();
                            promptDialogFragment2.A0N(A013);
                            AnonymousClass0LW A043 = restoreFromBackupActivity.A04();
                            if (A043 != null) {
                                AnonymousClass0QB r02 = new AnonymousClass0QB(A043);
                                r02.A0A(0, promptDialogFragment2, null, 1);
                                r02.A01();
                                return;
                            }
                            throw null;
                        }
                        return;
                    }
                    TextUtils.join(",", restoreFromBackupActivity.A0n);
                    TextUtils.join(",", restoreFromBackupActivity.A0o);
                    if (restoreFromBackupActivity.A0n()) {
                        AnonymousClass00E.A01();
                        if (!AnonymousClass0JJ.A0H(restoreFromBackupActivity)) {
                            Bundle A014 = AnonymousClass008.A01("dialog_id", 18);
                            AnonymousClass01X r1 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                            A014.putString("message", r1.A06(R.string.gdrive_message_restore_failed_retry_prompt_message));
                            A014.putBoolean("cancelable", false);
                            A014.putString("positive_button", r1.A06(R.string.restore_from_older));
                            A014.putString("negative_button", r1.A06(R.string.skip));
                            PromptDialogFragment promptDialogFragment3 = new PromptDialogFragment();
                            promptDialogFragment3.A0N(A014);
                            AnonymousClass0LW A044 = restoreFromBackupActivity.A04();
                            if (A044 != null) {
                                AnonymousClass0QB r03 = new AnonymousClass0QB(A044);
                                r03.A0A(0, promptDialogFragment3, null, 1);
                                r03.A01();
                                return;
                            }
                            throw null;
                        }
                        return;
                    }
                    restoreFromBackupActivity.A0V(false);
                    restoreFromBackupActivity.A0Z();
                    AnonymousClass02M r2 = ((ActivityC004702f) restoreFromBackupActivity).A0F;
                    String A062 = ((AnonymousClass2C0) restoreFromBackupActivity).A01.A06(R.string.msg_store_error_not_restored);
                    if (restoreFromBackupActivity != null) {
                        restoreFromBackupActivity.APr(A062);
                    } else {
                        r2.A0G(A062, 0);
                    }
                }
            }
        }
    }

    public void A0V(boolean z) {
        if (!(this instanceof RegisterName)) {
            this.A00.A03(z, true);
            return;
        }
        RegisterName registerName = (RegisterName) this;
        ((AnonymousClass0GE) registerName).A00.A03(z, true);
        AbstractDialogC40501tN r0 = registerName.A08;
        if (r0 != null && z) {
            r0.A00(1);
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 200) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            AbstractC07170We r0 = this.A00;
            if (r0.A06.A08(r0.A03)) {
                this.A00.A02();
            }
        } else {
            A0V(false);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C07160Wd r0 = new C07160Wd(this, this, ((ActivityC004702f) this).A0F, this.A01, this.A0U, this.A09, this.A0N, this.A02, this.A0H, this.A03, this.A04, this.A0B, this.A0L, ((AnonymousClass2C0) this).A01, this.A07, this.A0I, this.A0K, this.A0T, this.A0R, this.A0Q, this.A06, this.A05, this.A0E, this.A0M, this.A0O, this.A0C, this.A08, this.A0S, this.A0A, this.A0D, this.A0F, this.A0G, this.A0J, this.A0V);
        this.A00 = r0;
        ((AbstractC07180Wf) r0).A00.A03(this, new C39161r3(this));
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        AnonymousClass0MD r6;
        AbstractC07170We r4 = this.A00;
        if (i == 100) {
            Log.i("verifymsgstore/dialog/setup");
            AnonymousClass1ND r1 = new AnonymousClass1ND(r4.A01);
            AbstractC07170We.A06 = r1;
            AnonymousClass01X r2 = r4.A07;
            r1.setTitle(r2.A06(R.string.msg_store_migrate_title));
            AbstractC07170We.A06.setMessage(r2.A06(R.string.msg_store_migrate_message));
            AbstractC07170We.A06.setIndeterminate(false);
            AbstractC07170We.A06.setCancelable(false);
            AbstractC07170We.A06.setProgressStyle(1);
            r6 = AbstractC07170We.A06;
        } else if (i == 101) {
            Log.i("verifymsgstore/dialog/msgstoreerror");
            AnonymousClass0MB r3 = new AnonymousClass0MB(r4.A01);
            AnonymousClass01X r22 = r4.A07;
            String A062 = r22.A06(R.string.alert);
            AnonymousClass0MC r12 = r3.A01;
            r12.A0I = A062;
            r12.A0E = r22.A06(R.string.msg_store_error_found);
            r3.A07(r22.A06(R.string.ok), new DialogInterface$OnClickListenerC26161Jt(r4));
            r6 = r3.A00();
        } else if (i == 200) {
            Log.i("verifymsgstore/dialog/cannot-connect");
            r6 = r4.A01(200, R.string.msg_store_unable_to_start_restore_no_connectivity);
        } else if (i != 201) {
            r6 = null;
            switch (i) {
                case 103:
                    Log.i("verifymsgstore/dialog/restore");
                    AnonymousClass0MB r32 = new AnonymousClass0MB(r4.A01);
                    AnonymousClass01X r62 = r4.A07;
                    String A063 = r62.A06(R.string.msg_store_backup_found);
                    AnonymousClass0MC r23 = r32.A01;
                    r23.A0I = A063;
                    r23.A0E = r62.A06(R.string.msg_store_creation_backup_message);
                    r32.A07(r62.A06(R.string.yes), new DialogInterface$OnClickListenerC26211Jy(r4));
                    r32.A05(r62.A06(R.string.no), new AnonymousClass1K1(r4));
                    r23.A0J = false;
                    r6 = r32.A00();
                    break;
                case 104:
                    Log.i("verifymsgstore/dialog/groupsync");
                    AnonymousClass1ND r63 = new AnonymousClass1ND(r4.A01);
                    AnonymousClass01X r13 = r4.A07;
                    r63.setTitle(r13.A06(R.string.register_xmpp_title));
                    r63.setMessage(r13.A06(R.string.register_wait_message));
                    r63.setIndeterminate(true);
                    r63.setCancelable(false);
                    r6 = r63;
                    break;
                case 105:
                    Log.i("verifymsgstore/dialog/restoreduetoerror");
                    StringBuilder sb = new StringBuilder();
                    AnonymousClass01X r64 = r4.A07;
                    AnonymousClass008.A0o(r64, R.string.msg_store_lost_due_to_previous_error, sb, " ");
                    String A0E2 = AnonymousClass008.A0E(r64, R.string.msg_store_creation_backup_message_restore_due_to_error, sb);
                    AnonymousClass0MB r33 = new AnonymousClass0MB(r4.A01);
                    String A064 = r64.A06(R.string.msg_store_backup_found_title);
                    AnonymousClass0MC r24 = r33.A01;
                    r24.A0I = A064;
                    r24.A0E = A0E2;
                    r33.A07(r64.A06(R.string.msg_store_restore_db), new DialogInterface$OnClickListenerC26201Jx(r4));
                    r33.A05(r64.A06(R.string.msg_store_do_not_restore), new DialogInterface$OnClickListenerC26221Jz(r4));
                    r24.A0J = false;
                    r6 = r33.A00();
                    break;
                case 106:
                    AnonymousClass0MB r34 = new AnonymousClass0MB(r4.A01);
                    AnonymousClass01X r65 = r4.A07;
                    String A065 = r65.A06(R.string.msg_store_confirm);
                    AnonymousClass0MC r25 = r34.A01;
                    r25.A0I = A065;
                    r25.A0E = r65.A06(R.string.dont_restore_message);
                    r34.A07(r65.A06(R.string.msg_store_do_not_restore), new AnonymousClass1K0(r4));
                    r34.A05(r65.A06(R.string.cancel), new AnonymousClass1K2(r4));
                    r25.A0J = false;
                    r6 = r34.A00();
                    break;
                case 107:
                    Log.i("verifymsgstore/dialog/restorefrombackupduetoerrorcardnotfoundaskretry");
                    StringBuilder sb2 = new StringBuilder();
                    AnonymousClass01X r66 = r4.A07;
                    AnonymousClass008.A0o(r66, R.string.msg_store_lost_due_to_previous_error, sb2, " ");
                    boolean A012 = AnonymousClass00C.A01();
                    int i2 = R.string.msg_store_media_card_not_found_ask_retry_shared_storage;
                    if (A012) {
                        i2 = R.string.msg_store_media_card_not_found_ask_retry;
                    }
                    String A0E3 = AnonymousClass008.A0E(r66, i2, sb2);
                    AnonymousClass0MB r35 = new AnonymousClass0MB(r4.A01);
                    String A066 = r66.A06(R.string.alert);
                    AnonymousClass0MC r26 = r35.A01;
                    r26.A0I = A066;
                    r26.A0E = A0E3;
                    r35.A07(r66.A06(R.string.retry), new DialogInterface$OnClickListenerC26181Jv(r4));
                    r35.A05(r66.A06(R.string.skip), new DialogInterface$OnClickListenerC26151Js(r4));
                    r26.A0J = false;
                    r6 = r35.A00();
                    break;
                case AnonymousClass0PW.A03 /*{ENCODED_INT: 108}*/:
                    Log.i("verifymsgstore/dialog/msgstorenotrestored");
                    AnonymousClass0MB r36 = new AnonymousClass0MB(r4.A01);
                    AnonymousClass01X r27 = r4.A07;
                    String A067 = r27.A06(R.string.alert);
                    AnonymousClass0MC r14 = r36.A01;
                    r14.A0I = A067;
                    r14.A0E = r27.A06(R.string.msg_store_error_not_restored);
                    r36.A07(r27.A06(R.string.ok), null);
                    r6 = r36.A00();
                    break;
            }
        } else {
            Log.i("verifymsgstore/dialog/keyserviceunavailable");
            r6 = r4.A01(201, R.string.msg_store_unable_to_start_restore_process);
        }
        if (r6 != null) {
            return r6;
        }
        return super.onCreateDialog(i);
    }
}
