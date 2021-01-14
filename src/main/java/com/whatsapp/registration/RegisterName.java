package com.whatsapp.registration;

import X.AbstractC02190Az;
import X.AbstractC26561Lk;
import X.AbstractC658231r;
import X.AbstractC658331s;
import X.AbstractC658431t;
import X.AbstractC658531u;
import X.AbstractC658731w;
import X.AbstractC658931z;
import X.AbstractDialogC40501tN;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01J;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass03B;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass088;
import X.AnonymousClass08B;
import X.AnonymousClass08C;
import X.AnonymousClass09E;
import X.AnonymousClass09H;
import X.AnonymousClass0AQ;
import X.AnonymousClass0AR;
import X.AnonymousClass0AT;
import X.AnonymousClass0BP;
import X.AnonymousClass0EO;
import X.AnonymousClass0EQ;
import X.AnonymousClass0ES;
import X.AnonymousClass0EY;
import X.AnonymousClass0Eg;
import X.AnonymousClass0FE;
import X.AnonymousClass0FU;
import X.AnonymousClass0FV;
import X.AnonymousClass0FW;
import X.AnonymousClass0FZ;
import X.AnonymousClass0GE;
import X.AnonymousClass0GQ;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0HM;
import X.AnonymousClass0HN;
import X.AnonymousClass0HO;
import X.AnonymousClass0HP;
import X.AnonymousClass0HQ;
import X.AnonymousClass0I4;
import X.AnonymousClass0IB;
import X.AnonymousClass0JE;
import X.AnonymousClass0KP;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass2C0;
import X.AnonymousClass2NU;
import X.AnonymousClass2OC;
import X.AnonymousClass2OL;
import X.AnonymousClass30E;
import X.AnonymousClass30H;
import X.AnonymousClass30I;
import X.AnonymousClass30L;
import X.AnonymousClass30M;
import X.AnonymousClass321;
import X.AnonymousClass323;
import X.AnonymousClass324;
import X.AnonymousClass325;
import X.AnonymousClass3ZG;
import X.C002001d;
import X.C002101e;
import X.C007003k;
import X.C014308b;
import X.C014508d;
import X.C02180Ay;
import X.C02290Bk;
import X.C02660Cy;
import X.C03160Fa;
import X.C03930Ii;
import X.C06170Sb;
import X.C40411tE;
import X.C48672Ng;
import X.C53392d8;
import X.C53492dM;
import X.C70693Ma;
import X.C70733Me;
import X.C70743Mf;
import X.DialogC70763Mh;
import X.DialogInterface$OnClickListenerC65122zL;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.WaEditText;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.crop.CropImage;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;

public class RegisterName extends AnonymousClass0GE {
    public static AnonymousClass30M A1K;
    public long A00;
    public Bitmap A01;
    public Handler A02 = new AnonymousClass30H(this, Looper.getMainLooper());
    public Handler A03 = new AnonymousClass30I(this, Looper.getMainLooper());
    public View A04;
    public View A05;
    public ImageView A06;
    public AbstractC26561Lk A07 = new C70733Me(this);
    public AbstractDialogC40501tN A08;
    public WaEditText A09;
    public AnonymousClass0BP A0A = null;
    public C007003k A0B;
    public C53392d8 A0C;
    public C48672Ng A0D;
    public DialogC70763Mh A0E;
    public AnonymousClass30L A0F;
    public RegistrationScrollView A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public boolean A0K;
    public boolean A0L;
    public final AnonymousClass088 A0M = AnonymousClass088.A00();
    public final AnonymousClass01I A0N = AnonymousClass01I.A00();
    public final AnonymousClass0I4 A0O = AnonymousClass0I4.A00();
    public final AnonymousClass0ES A0P = AnonymousClass0ES.A00();
    public final AnonymousClass0EY A0Q = AnonymousClass0EY.A00();
    public final AnonymousClass03B A0R = AnonymousClass03B.A00();
    public final AnonymousClass0HQ A0S = AnonymousClass0HQ.A00();
    public final AnonymousClass0HJ A0T = AnonymousClass0HJ.A02();
    public final AnonymousClass08B A0U = AnonymousClass08B.A00;
    public final C014308b A0V = C014308b.A00();
    public final AnonymousClass08C A0W = AnonymousClass08C.A00();
    public final AnonymousClass0HK A0X = AnonymousClass0HK.A00();
    public final AnonymousClass0HN A0Y = AnonymousClass0HN.A00();
    public final AnonymousClass0IB A0Z = AnonymousClass0IB.A00();
    public final AnonymousClass0EQ A0a = AnonymousClass0EQ.A00();
    public final AnonymousClass04j A0b = AnonymousClass04j.A00();
    public final AnonymousClass03P A0c = AnonymousClass03P.A00();
    public final AnonymousClass00S A0d = AnonymousClass00S.A00();
    public final AnonymousClass00G A0e = AnonymousClass00G.A01;
    public final AnonymousClass03S A0f = AnonymousClass03S.A00();
    public final AnonymousClass0AQ A0g = AnonymousClass0AQ.A00();
    public final AnonymousClass0HO A0h = AnonymousClass0HO.A00();
    public final C014508d A0i = C014508d.A00();
    public final C03930Ii A0j = C03930Ii.A00();
    public final C53492dM A0k = C53492dM.A00();
    public final AnonymousClass0M9 A0l = AnonymousClass0M9.A01();
    public final AnonymousClass2OC A0m = AnonymousClass2OC.A00();
    public final AnonymousClass00Y A0n = AnonymousClass00Y.A00();
    public final AnonymousClass2OL A0o = AnonymousClass2OL.A00();
    public final AnonymousClass0Eg A0p = AnonymousClass0Eg.A00();
    public final C02660Cy A0q = C02660Cy.A00();
    public final AnonymousClass09H A0r = AnonymousClass09H.A01();
    public final C03160Fa A0s = C03160Fa.A00();
    public final AnonymousClass0FZ A0t = AnonymousClass0FZ.A00();
    public final AnonymousClass0AR A0u = AnonymousClass0AR.A00();
    public final AnonymousClass0FE A0v = AnonymousClass0FE.A00();
    public final AnonymousClass0GQ A0w = AnonymousClass0GQ.A00();
    public final AnonymousClass022 A0x = AnonymousClass022.A00();
    public final AnonymousClass30E A0y = AnonymousClass30E.A00();
    public final C70743Mf A0z = new C70743Mf(this);
    public final AnonymousClass0KP A10 = AnonymousClass0KP.A00();
    public final AnonymousClass0HM A11 = AnonymousClass0HM.A00();
    public final AnonymousClass0HP A12 = AnonymousClass0HP.A00();
    public final AnonymousClass0FV A13 = AnonymousClass0FV.A00();
    public final AnonymousClass0FW A14 = AnonymousClass0FW.A00();
    public final AnonymousClass0FU A15 = AnonymousClass0FU.A01();
    public final AbstractC658231r A16 = AbstractC658231r.A00();
    public final AbstractC658331s A17 = AbstractC658331s.A00();
    public final AbstractC658431t A18 = AbstractC658431t.A00();
    public final AbstractC658531u A19 = AbstractC658531u.A00();
    public final AbstractC658731w A1A = AbstractC658731w.A00();
    public final AbstractC658931z A1B = AbstractC658931z.A00();
    public final AnonymousClass321 A1C = AnonymousClass321.A00();
    public final AnonymousClass323 A1D = AnonymousClass323.A00();
    public final AnonymousClass324 A1E = AnonymousClass324.A00();
    public final AnonymousClass325 A1F = AnonymousClass325.A00();
    public final AnonymousClass0AT A1G = AnonymousClass0AT.A03;
    public final C06170Sb A1H = C06170Sb.A00();
    public final AnonymousClass00T A1I = C002101e.A00();
    public final AbstractC02190Az A1J = new C02180Ay(C70693Ma.A00, null);

    public RegisterName() {
        super(true);
    }

    public static void A04(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName("com.whatsapp", "com.whatsapp.Main");
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        intent.addFlags(2097152);
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, R.mipmap.icon));
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        context.sendBroadcast(intent2);
    }

    public void A0W() {
        ((AnonymousClass0GE) this).A09.A04(false);
        ((AnonymousClass0GE) this).A0G.A01();
        this.A0Y.A04();
        A0T();
    }

    public void A0X() {
        Log.i("registername/start");
        Editable text = this.A09.getText();
        if (text != null) {
            String A1l = C002001d.A1l(text.toString().trim());
            if (C002001d.A3f(A1l, AnonymousClass2NU.A01)) {
                Log.w("registername/checkmarks in pushname");
                APm(PushnameEmojiBlacklistDialogFragment.A00(A1l));
                return;
            }
            boolean z = false;
            if (A1l.length() == 0) {
                Log.w("registername/no-pushname");
                ((ActivityC004702f) this).A0F.A06(R.string.register_failure_noname, 0);
                return;
            }
            AnonymousClass30M r3 = A1K;
            if (r3 == null || r3.A03) {
                StringBuilder A0S2 = AnonymousClass008.A0S("registername/check-sinitializer, null?");
                if (r3 == null) {
                    z = true;
                }
                A0S2.append(z);
                Log.i(A0S2.toString());
                AbstractC658731w r0 = this.A1A;
                AnonymousClass02M r02 = ((ActivityC004702f) this).A0F;
                AnonymousClass01I r03 = this.A0N;
                AnonymousClass00Y r04 = this.A0n;
                AnonymousClass0AR r05 = this.A0u;
                AnonymousClass09E r06 = ((AnonymousClass0GE) this).A0H;
                AnonymousClass01J r07 = ((AnonymousClass0GE) this).A03;
                AnonymousClass01A r08 = ((AnonymousClass0GE) this).A04;
                C014308b r09 = this.A0V;
                AnonymousClass01X r32 = ((AnonymousClass2C0) this).A01;
                AnonymousClass323 r010 = this.A1D;
                AnonymousClass08B r011 = this.A0U;
                AnonymousClass0AT r012 = this.A1G;
                AnonymousClass0EO r013 = ((AnonymousClass0GE) this).A0K;
                AnonymousClass0EQ r014 = this.A0a;
                AnonymousClass0HN r015 = this.A0Y;
                AnonymousClass0FZ r016 = this.A0t;
                AnonymousClass0ES r15 = this.A0P;
                AnonymousClass0HM r14 = this.A11;
                AnonymousClass00D r5 = ((ActivityC004702f) this).A0J;
                AnonymousClass30M r017 = new AnonymousClass30M(r0, r02, r03, r04, r05, r06, r07, r08, r09, r32, r010, r011, r012, r013, r014, r015, r016, r15, r14, r5, this.A0O, this.A1C, this.A0w, this.A16, ((AnonymousClass0GE) this).A0F, this.A0g, this.A0Z, this.A0z, this.A02);
                A1K = r017;
                r017.A01 = this.A00;
                this.A1I.ANF(new RunnableEBaseShape0S1100000_I0(this, A1l, 7));
                C002001d.A2O(this, 0);
                if (((CompoundButton) findViewById(R.id.cbx_app_shortcut)).isChecked()) {
                    A04(this, r32.A06(R.string.launcher_app_name));
                }
                View view = this.A05;
                if (view != null) {
                    view.setVisibility(4);
                }
                AnonymousClass008.A0l(r5, "com.whatsapp.registername.initializer_start_time", System.currentTimeMillis());
                this.A03.sendEmptyMessageDelayed(0, 600000);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A0Y() {
        if (!((AnonymousClass0GE) this).A0G.A01.A08(false)) {
            AnonymousClass0FW r3 = this.A14;
            if (r3.A01.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
                r3.A01();
            }
            String externalStorageState = Environment.getExternalStorageState();
            StringBuilder sb = new StringBuilder("registername/clicked/sdcardstate ");
            sb.append(externalStorageState);
            Log.i(sb.toString());
            if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                Log.i("registername/check-for-local-and-remote-backups");
                Intent intent = new Intent(this, RestoreFromBackupActivity.class);
                intent.setAction("action_show_restore_one_time_setup");
                startActivityForResult(intent, 14);
                return;
            }
            C002001d.A2O(this, 107);
            return;
        }
        Log.i("registername/msgstore/healthy");
        A0W();
        ((ActivityC004702f) this).A0J.A0T(System.currentTimeMillis() + 604800000);
    }

    public final void A0Z() {
        View view;
        long j = ((ActivityC004702f) this).A0J.A00.getLong("com.whatsapp.registername.initializer_start_time", -1);
        if (j > 0 && System.currentTimeMillis() - j > 600000 && (view = this.A05) != null) {
            view.setVisibility(0);
        }
    }

    public final void A0a() {
        Bitmap bitmap;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size);
        float dimension = getResources().getDimension(R.dimen.registration_profile_photo_radius);
        if (this.A0B != null) {
            AnonymousClass01I r0 = this.A0N;
            r0.A04();
            if (!C40411tE.A00(r0.A03)) {
                this.A06.setEnabled(true);
                this.A04.setVisibility(8);
                if (!this.A0W.A03(this.A0B).exists() || (bitmap = this.A0X.A02(this.A0B, dimensionPixelSize, dimension, false)) == null) {
                    if (this.A0T != null) {
                        bitmap = AnonymousClass0HJ.A01(this, R.drawable.ic_reg_addphoto, dimensionPixelSize, dimension);
                    } else {
                        throw null;
                    }
                }
                this.A06.setImageBitmap(bitmap);
            }
        }
        this.A06.setEnabled(false);
        this.A04.setVisibility(0);
        bitmap = this.A01;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
            this.A01 = bitmap;
        }
        this.A06.setImageBitmap(bitmap);
    }

    public final void A0b(Integer num, Integer num2) {
        AnonymousClass03S r2 = this.A0f;
        if (r2.A06() && this.A0J.intValue() == 1) {
            this.A0J = num;
        }
        if (r2.A03() && this.A0I.intValue() == 1) {
            this.A0I = num2;
        }
    }

    public void lambda$onCreate$1234$RegisterName(View view) {
        Log.i("registername/clicked");
        A0X();
    }

    public /* synthetic */ void lambda$onCreate$1238$RegisterName(View view) {
        this.A0K = true;
        this.A0Q.A05(this, this.A0B, 12);
    }

    @Override // X.AnonymousClass0GE, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder("registername/activity-result request:");
        sb.append(i);
        sb.append(" result:");
        sb.append(i2);
        Log.i(sb.toString());
        switch (i) {
            case 12:
                if (i2 != -1) {
                    return;
                }
                if (intent == null || !intent.getBooleanExtra("is_reset", false)) {
                    Intent A012 = this.A0Q.A01(this, this, intent);
                    if (A012 != null) {
                        startActivityForResult(A012, 13);
                        return;
                    }
                    return;
                }
                this.A0Q.A06(this.A0B);
                A0a();
                return;
            case 13:
                AnonymousClass0EY r2 = this.A0Q;
                r2.A04().delete();
                if (i2 == -1) {
                    if (r2.A09(this.A0B)) {
                        A0a();
                        return;
                    }
                    return;
                } else if (i2 == 0 && intent != null) {
                    CropImage.A00(r2.A02, intent, this, r2.A0C);
                    return;
                } else {
                    return;
                }
            case 14:
                if (i2 == 3) {
                    Log.i("registername/activity-result backup (Google Drive or local) found and is being restored.");
                    Log.i("registername/msgstore-download-finished");
                    A0W();
                    AbstractDialogC40501tN r0 = this.A08;
                    if (r0 != null) {
                        r0.hide();
                    }
                    this.A0H = 3;
                } else if (i2 == 0) {
                    Log.i("registername/activity-result gdrive-activity canceled");
                    ((AnonymousClass0GE) this).A00.A02();
                } else if (i2 == 2) {
                    A0V(false);
                    this.A0H = 2;
                } else if (i2 == 1) {
                    A0V(false);
                    this.A0H = 1;
                } else {
                    StringBuilder sb2 = new StringBuilder("registername/activity-result unknown result code ");
                    sb2.append(i2);
                    sb2.append(" from RestoreFromBackupActivity.");
                    Log.e(sb2.toString());
                }
                A0b(4, 4);
                return;
            case 15:
                Log.d("registername/activity-result/restore_from_backup/remove");
                C002001d.A2N(this, 103);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                if (i2 == 1) {
                    Log.i("registername/activity-result/successfully-restored");
                    String string = ((ActivityC004702f) this).A0J.A00.getString("push_name", "");
                    if (!TextUtils.isEmpty(string)) {
                        this.A09.setText(string);
                        WaEditText waEditText = this.A09;
                        waEditText.setSelection(waEditText.length());
                    }
                    A0W();
                } else if (i2 == 2) {
                    Log.i("registername/check-for-local-and-remote-backups");
                    Intent intent2 = new Intent(this, RestoreFromBackupActivity.class);
                    intent2.setAction("action_show_restore_one_time_setup");
                    startActivityForResult(intent2, 14);
                }
                this.A13.A01.A09 = Long.valueOf(SystemClock.elapsedRealtime() - ((ActivityC004702f) this).A0J.A00.getLong("direct_migration_start_time", -1));
                return;
            case 17:
                A0b(3, 3);
                A0Y();
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        C53392d8 r0 = this.A0C;
        if (r0 == null || !r0.isShowing()) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            startActivity(intent);
            return;
        }
        this.A0C.dismiss();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        DialogC70763Mh r1 = this.A0E;
        if (r1 != null) {
            r1.onCreate(r1.onSaveInstanceState());
            DialogC70763Mh r2 = this.A0E;
            r2.A01.A05 = r2.findViewById(R.id.pay_ed_contact_support);
            A0Z();
        }
        AbstractDialogC40501tN r12 = this.A08;
        if (r12 != null) {
            r12.onCreate(r12.onSaveInstanceState());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v50, resolved type: com.whatsapp.WaEditText */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        if (r29.getBoolean("started_gdrive_new_user_activity", false) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0242, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0246, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x024d, code lost:
        if (r9 != null) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0271, code lost:
        if (r9 != null) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x027d, code lost:
        if (r9.contains("@") == false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x027f, code lost:
        r0 = r9.indexOf("@");
        r7 = r7 == true ? 1 : 0;
        r7 = r7 == true ? 1 : 0;
        r7 = r7 == true ? 1 : 0;
        r7 = r7 == true ? 1 : 0;
        r7 = r7 == true ? 1 : 0;
        r9 = r9.substring(r7, r0).replace('.', ' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0334, code lost:
        r9 = r9.replace('.', ' ');
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass2C0, X.AnonymousClass0GE, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r29) {
        /*
        // Method dump skipped, instructions count: 833
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onCreate(android.os.Bundle):void");
    }

    @Override // X.AnonymousClass0GE, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            Log.i("registername/dialog/initprogress");
            if (A1K == null) {
                Log.w("registername/dialog/initprogress/init-null/remove");
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableEBaseShape4S0100000_I0_4(this, 0), 3);
            }
            DialogC70763Mh r0 = new DialogC70763Mh(this, ((AnonymousClass2C0) this).A01);
            this.A0E = r0;
            r0.setCancelable(false);
            return this.A0E;
        } else if (i == 1) {
            Log.w("registername/dialog/failed-net");
            AnonymousClass0MB r6 = new AnonymousClass0MB(this);
            AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
            String A062 = r5.A06(R.string.initialization_fail_title);
            AnonymousClass0MC r3 = r6.A01;
            r3.A0I = A062;
            r3.A0E = r5.A0D(R.string.initialization_fail_message, r5.A06(R.string.connectivity_self_help_instructions));
            r6.A07(r5.A06(R.string.initialization_fail_retry), new DialogInterface$OnClickListenerC65122zL(this));
            return r6.A00();
        } else if (i == 103) {
            Log.i("registername/dialog/restore");
            AnonymousClass01X r52 = ((AnonymousClass2C0) this).A01;
            C02290Bk r2 = ((AnonymousClass0GE) this).A0E;
            AnonymousClass3ZG r62 = new AnonymousClass3ZG(this, this, r52, r2, this.A0i, this.A11);
            this.A08 = r62;
            r62.setCancelable(false);
            Log.d("restorebackupdialog/lastbackup/look at files");
            long A082 = r2.A08();
            if (A082 != -1) {
                AnonymousClass008.A0z("restorebackupdialog/lastbackup/fromfiles/set to ", A082);
            }
            this.A1I.ANF(new RunnableEBaseShape0S1100000_I0(this, (String) C002001d.A1F(r52, A082), 8));
            return this.A08;
        } else if (i != 109) {
            return super.onCreateDialog(i);
        } else {
            Log.w("registername/dialog/cant-connect");
            return AnonymousClass0JE.A05(this, this.A1I, this.A0c, ((AnonymousClass2C0) this).A01, this.A0b, this.A0f, this.A10);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A06(R.string.registration_help));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        if (isFinishing()) {
            this.A0v.A04();
        }
        AnonymousClass0BP r1 = this.A0A;
        if (r1 != null) {
            this.A0U.A00(r1);
            this.A0A = null;
        }
        this.A0F.A00();
        RegistrationScrollView registrationScrollView = this.A0G;
        if (registrationScrollView != null) {
            registrationScrollView.getViewTreeObserver().removeOnScrollChangedListener(registrationScrollView.A07);
            if (registrationScrollView.A02 != null) {
                registrationScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(registrationScrollView.A02);
            }
            this.A0G = null;
        }
        super.onDestroy();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            AnonymousClass0HP r2 = this.A12;
            r2.A02("register-name");
            this.A0F.A01(this, r2, "register-name");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A11.A0B();
            startActivity(EULA.A04(this));
            finishAffinity();
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        Handler handler;
        super.onPause();
        AnonymousClass30M r2 = A1K;
        if (r2 != null && (handler = r2.A02) != null) {
            handler.removeMessages(0);
            r2.A02 = null;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (A1K != null) {
            C002001d.A2O(this, 0);
            AnonymousClass30M r2 = A1K;
            Handler handler = this.A02;
            if (r2.A03) {
                handler.sendEmptyMessage(0);
            }
            r2.A02 = handler;
            A0Z();
        }
        if (super.A0P.A02() && this.A0E == null) {
            C002001d.A2O(this, 0);
            Log.i("registername/resume reg verified; explicitly display continue screen");
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started_gdrive_new_user_activity", this.A0L);
    }
}
