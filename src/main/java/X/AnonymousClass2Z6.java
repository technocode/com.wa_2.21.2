package X;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.DocumentPickerActivity;
import com.whatsapp.MentionableEntry;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Z6  reason: invalid class name */
public final class AnonymousClass2Z6 extends AnonymousClass1PD implements AnonymousClass1PC, AnonymousClass1ME {
    public int A00;
    public AnonymousClass2HD A01;
    public final ActivityC004802g A02;
    public final AnonymousClass0GG A03;
    public final AbstractC004502c A04;
    public final AnonymousClass088 A05;
    public final AnonymousClass02M A06;
    public final AnonymousClass01I A07;
    public final MentionableEntry A08;
    public final C09190cR A09;
    public final AbstractC03900If A0A;
    public final AnonymousClass0IY A0B;
    public final C04350Ka A0C;
    public final C000300f A0D;
    public final AnonymousClass1S6 A0E;
    public final AbstractC03650Hc A0F;
    public final AnonymousClass2HH A0G;
    public final AbstractC07200Wh A0H;
    public final AnonymousClass00C A0I;
    public final AnonymousClass03P A0J;
    public final AnonymousClass03S A0K;
    public final AnonymousClass00D A0L;
    public final AnonymousClass00Y A0M;
    public final AnonymousClass02N A0N;
    public final C02770Dj A0O;
    public final C68453Dg A0P;
    public final C02040Ak A0Q;
    public final AnonymousClass0L6 A0R;
    public final AnonymousClass022 A0S;
    public final AnonymousClass3Ot A0T;
    public final C06170Sb A0U;
    public final C02220Bc A0V;
    public final boolean A0W;

    @Override // X.AnonymousClass1ME
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public AnonymousClass2Z6(AbstractC004502c r4, ActivityC004802g r5, AnonymousClass02M r6, C06170Sb r7, AnonymousClass01I r8, C04350Ka r9, AnonymousClass088 r10, AnonymousClass00Y r11, C09190cR r12, C000300f r13, AnonymousClass1S6 r14, C02770Dj r15, AnonymousClass3Ot r16, C02220Bc r17, AnonymousClass03P r18, AnonymousClass0GG r19, AnonymousClass0L6 r20, AnonymousClass00C r21, AnonymousClass03S r22, AnonymousClass00D r23, C02040Ak r24, C68453Dg r25, AnonymousClass0IY r26, AnonymousClass022 r27, AbstractC03650Hc r28, AbstractC07200Wh r29, AnonymousClass02N r30, boolean z, MentionableEntry mentionableEntry, AnonymousClass2HH r33) {
        C51502Yz r0 = new C51502Yz(this);
        this.A0A = r0;
        this.A02 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A0U = r7;
        this.A07 = r8;
        this.A0C = r9;
        this.A05 = r10;
        this.A0M = r11;
        this.A09 = r12;
        this.A0D = r13;
        this.A0E = r14;
        this.A0O = r15;
        this.A0T = r16;
        this.A0V = r17;
        this.A0J = r18;
        this.A03 = r19;
        this.A0R = r20;
        this.A0I = r21;
        this.A0K = r22;
        this.A0L = r23;
        this.A0Q = r24;
        this.A0P = r25;
        this.A0B = r26;
        this.A0S = r27;
        this.A0F = r28;
        this.A0H = r29;
        this.A0N = r30;
        this.A0W = z;
        this.A08 = mentionableEntry;
        this.A0G = r33;
        r26.A01(r0);
    }

    public void A00() {
        ActivityC004802g r4 = this.A02;
        if (RequestPermissionActivity.A0K(r4, this.A0K, 31) && this.A0I.A09(this.A0H)) {
            C02220Bc.A02(this.A06, this.A05, this.A0S, 23, r4, null);
        }
    }

    public void A01() {
        ActivityC004802g r4 = this.A02;
        if (RequestPermissionActivity.A0K(r4, this.A0K, 32) && this.A0I.A09(this.A0H)) {
            C02220Bc.A02(this.A06, this.A05, this.A0S, 4, r4, null);
        }
    }

    public final void A02() {
        if (A0C(this.A0G.A05) && this.A0I.A09(this.A0H)) {
            C02220Bc.A02(this.A06, this.A05, this.A0S, 5, this.A02, this.A0N);
        }
    }

    public final void A03() {
        Bundle A042;
        AbstractC007503q A8c = this.A0F.A8c();
        ActivityC004802g r3 = this.A02;
        Intent intent = new Intent(r3, PhoneContactsSelector.class);
        intent.putExtra("jid", AnonymousClass1VY.A0D(this.A0N));
        if (A8c == null) {
            A042 = null;
        } else {
            A042 = AnonymousClass0FI.A04(A8c.A0n);
        }
        intent.putExtra("quoted_message", A042);
        intent.putExtra("quoted_group_jid", AnonymousClass1VY.A0D(AnonymousClass0FI.A05(A8c)));
        intent.putExtra("has_number_from_url", this.A0W);
        r3.startActivityForResult(intent, 9);
    }

    public final void A04() {
        if (A0C(this.A0G.A06) && this.A0I.A09(this.A0H)) {
            ActivityC004802g r3 = this.A02;
            AnonymousClass02N r1 = this.A0N;
            Intent intent = new Intent(r3, DocumentPickerActivity.class);
            intent.putExtra("jid", r1.getRawString());
            r3.startActivityForResult(intent, 6);
        }
    }

    public final void A05() {
        Class cls;
        long j;
        AbstractC007503q A8c = this.A0F.A8c();
        C02770Dj r0 = this.A0O;
        ActivityC004802g r4 = this.A02;
        if (r0.A09(r4)) {
            cls = LocationPicker2.class;
        } else {
            cls = LocationPicker.class;
        }
        Intent intent = new Intent(r4, cls);
        intent.putExtra("jid", AnonymousClass1VY.A0D(this.A0N));
        if (A8c == null) {
            j = 0;
        } else {
            j = A8c.A0p;
        }
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", AnonymousClass1VY.A0D(AnonymousClass0FI.A05(A8c)));
        intent.putExtra("has_number_from_url", this.A0W);
        r4.startActivityForResult(intent, this.A0G.A09);
    }

    public final void A06() {
        long j;
        AbstractC007503q A8c = this.A0F.A8c();
        if (A0C(this.A0G.A07) && this.A0I.A09(this.A0H)) {
            ActivityC004802g r4 = this.A02;
            AnonymousClass02N r10 = this.A0N;
            if (A8c == null) {
                j = 0;
            } else {
                j = A8c.A0p;
            }
            AnonymousClass02U A052 = AnonymousClass0FI.A05(A8c);
            boolean z = this.A0W;
            MentionableEntry mentionableEntry = this.A08;
            String A1l = C002001d.A1l(mentionableEntry.getStringText());
            List mentions = mentionableEntry.getMentions();
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI, r4, GalleryPicker.class);
            intent.putExtra("max_items", 30);
            intent.putExtra("jid", r10.getRawString());
            intent.putExtra("quoted_message_row_id", j);
            intent.putExtra("quoted_group_jid", AnonymousClass1VY.A0D(A052));
            intent.putExtra("number_from_url", z);
            intent.putExtra("send", true);
            intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
            intent.putExtra("android.intent.extra.TEXT", A1l);
            intent.putExtra("mentions", AnonymousClass1VY.A0F(mentions));
            r4.startActivityForResult(intent, 22);
        }
    }

    public final void A07() {
        if (A0C(this.A0G.A08) && this.A0I.A09(this.A0H)) {
            C02220Bc.A02(this.A06, this.A05, this.A0S, 21, this.A02, null);
        }
    }

    public void A08(int i) {
        int i2;
        long j;
        AnonymousClass0L6 r3 = this.A0R;
        if (i == 1) {
            i2 = 2;
        } else {
            i2 = 3;
            if (i != 2) {
                i2 = 4;
                if (i != 3) {
                    i2 = 5;
                    if (i != 4) {
                        i2 = 6;
                        if (i != 5) {
                            if (i == 7) {
                                i2 = 7;
                            } else {
                                i2 = 1;
                                if (i == 6) {
                                    i2 = 8;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (r3.A01 != 0 && Math.random() * ((double) 5) < 1.0d) {
            Log.d("cameraopentracker/start");
            r3.A01 = 1;
            r3.A02 = SystemClock.elapsedRealtime();
            r3.A00 = i2;
        }
        ActivityC004802g r4 = this.A02;
        int i3 = 30;
        Intent A062 = RequestPermissionActivity.A06(r4, this.A0K, 30);
        if (A062 == null) {
            AnonymousClass00C r1 = this.A0I;
            if (r1.A09(this.A0H)) {
                if (r1.A02() < ((long) ((this.A0D.A06(AbstractC000400g.A3a) << 10) << 10))) {
                    C28051Sr.A1Z(this.A0M, r4, this.A04, 5);
                    r3.A01();
                    return;
                }
                AnonymousClass0GG r2 = this.A03;
                AnonymousClass02N r12 = this.A0N;
                if (r2.A0H(UserJid.of(r12))) {
                    C002001d.A2O(r4, 106);
                    r3.A01();
                    return;
                }
                AbstractC007503q A8c = this.A0F.A8c();
                Intent intent = new Intent(r4, CameraActivity.class);
                intent.putExtra("jid", AnonymousClass1VY.A0D(r12));
                if (A8c == null) {
                    j = 0;
                } else {
                    j = A8c.A0p;
                }
                intent.putExtra("quoted_message_row_id", j);
                intent.putExtra("quoted_group_jid", AnonymousClass1VY.A0D(AnonymousClass0FI.A05(A8c)));
                intent.putExtra("chat_opened_from_url", this.A0W);
                intent.putExtra("origin", i);
                MentionableEntry mentionableEntry = this.A08;
                intent.putExtra("android.intent.extra.TEXT", C002001d.A1l(mentionableEntry.getStringText()));
                intent.putStringArrayListExtra("mentions", AnonymousClass1VY.A0F(mentionableEntry.getMentions()));
                r4.startActivityForResult(intent, this.A0G.A03);
                C28301Tu.A03();
                return;
            }
        } else {
            if (i == 2) {
                i3 = this.A0G.A00;
            } else if (i == 3) {
                i3 = this.A0G.A01;
            } else if (i == 5) {
                i3 = this.A0G.A02;
            }
            r4.startActivityForResult(A062, i3);
        }
        r3.A01();
    }

    public void A09(Uri uri, Byte b, int i) {
        if (this.A03.A0H(UserJid.of(this.A0N))) {
            C002001d.A2O(this.A02, 106);
        } else {
            A0A(uri, b, i);
        }
    }

    public final void A0A(Uri uri, Byte b, int i) {
        String str;
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            long j = 0;
            ActivityC004802g r6 = this.A02;
            String A0D2 = AnonymousClass1VY.A0D(this.A0N);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass2PG r1 = new AnonymousClass2PG(uri);
            MentionableEntry mentionableEntry = this.A08;
            r1.A0A(C002001d.A1l(mentionableEntry.getStringText()));
            r1.A0B(C006803i.A0M(mentionableEntry.getMentions()));
            synchronized (r1) {
                r1.A07 = b;
            }
            C08340aw r0 = new C08340aw(r1);
            Bundle bundle = new Bundle();
            r0.A02(bundle);
            AbstractC007503q A8c = this.A0F.A8c();
            if (A8c != null) {
                j = A8c.A0p;
                str = AnonymousClass1VY.A0D(AnonymousClass0FI.A05(A8c));
            } else {
                str = null;
            }
            Intent intent = new Intent(r6, MediaPreviewActivity.class);
            intent.putExtra("android.intent.extra.STREAM", arrayList);
            intent.putExtra("android.intent.extra.TEXT", (String) null);
            intent.putExtra("jid", A0D2);
            intent.putExtra("jids", (Serializable) null);
            intent.putExtra("max_items", 0);
            intent.putExtra("origin", i);
            intent.putExtra("picker_open_time", elapsedRealtime);
            intent.putExtra("send", true);
            intent.putExtra("quoted_message_row_id", j);
            intent.putExtra("quoted_group_jid", str);
            intent.putExtra("number_from_url", false);
            intent.putExtra("media_preview_params", bundle);
            intent.putExtra("smb_quick_reply", false);
            intent.putExtra("start_home", false);
            intent.putExtra("animate_uri", (Parcelable) null);
            intent.putExtra("preselected_image_uri", (Parcelable) null);
            intent.putExtra("scan_for_qr", false);
            r6.startActivityForResult(intent, 22);
            return;
        }
        Log.e("conversation/setuppreview/share-failed");
        this.A06.A06(R.string.share_failed, 0);
    }

    public void A0B(View view, int i, boolean z) {
        boolean z2;
        ActivityC004802g r9 = this.A02;
        AnonymousClass2HD r8 = new AnonymousClass2HD(r9, this.A06, this.A0U, view, this.A0N, z, this);
        this.A01 = r8;
        this.A00 = i;
        Resources resources = r9.getResources();
        int[] iArr = new int[2];
        View view2 = r8.A07;
        view2.getLocationOnScreen(iArr);
        if (((float) (C008805h.A09(r9).y - (view2.getHeight() + iArr[1]))) < C002301g.A0K.A00 * 64.0f || (Build.VERSION.SDK_INT >= 24 && r9.isInMultiWindowMode())) {
            z2 = true;
        } else {
            z2 = false;
        }
        r8.A00 = view2.getWidth() / 2;
        if (z2) {
            r8.A07(r9, true, 300, r8.A02(r9));
        } else {
            r8.A07(r9, false, 300, resources.getDimensionPixelSize(R.dimen.attach_popup_top_margin));
        }
    }

    public final boolean A0C(int i) {
        if (this.A0K.A06()) {
            return true;
        }
        ActivityC004802g r4 = this.A02;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.permission_storage_need_write_access_on_sending_media_v30;
        if (i2 < 30) {
            i3 = R.string.permission_storage_need_write_access_on_sending_media;
        }
        RequestPermissionActivity.A0B(r4, R.string.permission_storage_need_write_access_on_sending_media_request, i3, false, i);
        return false;
    }

    @Override // X.AnonymousClass1PD
    public void onActivityDestroyed(Activity activity) {
        AnonymousClass2HD r0 = this.A01;
        if (r0 != null && r0.isShowing()) {
            this.A01.A03();
        }
        this.A0B.A00(this.A0A);
    }

    @Override // X.AnonymousClass1PC
    public boolean onActivityResult(int i, int i2, Intent intent) {
        int i3;
        Uri fromFile;
        AnonymousClass2HH r2 = this.A0G;
        if (i == r2.A04) {
            A05();
            return true;
        } else if (i == 23 && i2 == 0) {
            AnonymousClass022 r22 = this.A0S;
            synchronized (C02230Bd.class) {
                if (C02230Bd.A00 > 0) {
                    SharedPreferences.Editor edit = r22.A01(AnonymousClass020.A02).edit();
                    int i4 = C02230Bd.A00 - 1;
                    C02230Bd.A00 = i4;
                    edit.putInt("file_index", i4);
                    edit.apply();
                }
            }
            return true;
        } else if (i2 != -1) {
            return false;
        } else {
            if (i == 30 || i == r2.A00) {
                i3 = 2;
            } else if (i == r2.A01) {
                i3 = 3;
            } else {
                i3 = 5;
                if (i != r2.A02) {
                    if (i == 31) {
                        A00();
                        return true;
                    } else if (i == 32) {
                        A01();
                        return true;
                    } else if (i == 150) {
                        A03();
                        return true;
                    } else if (i == r2.A07) {
                        A06();
                        return true;
                    } else if (i == r2.A08) {
                        A07();
                        return true;
                    } else if (i == r2.A05) {
                        A02();
                        return true;
                    } else if (i == r2.A06) {
                        A04();
                        return true;
                    } else if (i == 44 || i == 88) {
                        return true;
                    } else {
                        if (i == 6) {
                            if (intent != null) {
                                Uri data = intent.getData();
                                if (data != null) {
                                    C04350Ka r4 = this.A0C;
                                    AnonymousClass02N r3 = this.A0N;
                                    String A0O2 = C02230Bd.A0O(this.A0J.A06(), data);
                                    AbstractC007503q A8c = this.A0F.A8c();
                                    AbstractC004502c r9 = this.A04;
                                    boolean z = this.A0W;
                                    if (r4 != null) {
                                        r4.A05(Collections.singletonList(r3), data, A0O2, A8c, r9, z);
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                    if (parcelableArrayListExtra != null) {
                                        Iterator it = parcelableArrayListExtra.iterator();
                                        while (it.hasNext()) {
                                            Uri uri = (Uri) it.next();
                                            C04350Ka r5 = this.A0C;
                                            AnonymousClass02N r32 = this.A0N;
                                            String A0O3 = C02230Bd.A0O(this.A0J.A06(), uri);
                                            AbstractC007503q A8c2 = this.A0F.A8c();
                                            AbstractC004502c r10 = this.A04;
                                            boolean z2 = this.A0W;
                                            if (r5 != null) {
                                                r5.A05(Collections.singletonList(r32), uri, A0O3, A8c2, r10, z2);
                                            } else {
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                this.A0F.A28();
                                return true;
                            }
                            throw null;
                        } else if (i == 5) {
                            if (intent != null) {
                                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("result_uris");
                                if (parcelableArrayListExtra2 == null) {
                                    if (intent.getData() != null) {
                                        parcelableArrayListExtra2 = new ArrayList();
                                        parcelableArrayListExtra2.add(intent.getData());
                                    } else {
                                        Log.w("(conversation|messagereply)/audio/share/failed");
                                        this.A06.A06(R.string.share_failed, 0);
                                        return true;
                                    }
                                }
                                Iterator it2 = parcelableArrayListExtra2.iterator();
                                while (it2.hasNext()) {
                                    this.A0V.A0C((Uri) it2.next(), this.A04, new C51462Yv(this, intent));
                                    this.A0F.A27();
                                }
                                return true;
                            }
                            throw null;
                        } else if (i == 23) {
                            Uri fromFile2 = Uri.fromFile(AnonymousClass35M.A01(this.A0S));
                            C02230Bd.A0R(this.A02, fromFile2);
                            A0A(fromFile2, null, 8);
                            return true;
                        } else if (i == 4) {
                            if (intent == null || intent.getData() == null) {
                                File A012 = AnonymousClass35M.A01(this.A0S);
                                if (A012.exists()) {
                                    fromFile = Uri.fromFile(A012);
                                    C02230Bd.A0R(this.A02, fromFile);
                                } else {
                                    StringBuilder sb = new StringBuilder("conversation/video/share/nocapturefile ");
                                    sb.append(A012);
                                    Log.e(sb.toString());
                                    Log.w("conversation/video/share/failed");
                                    this.A06.A06(R.string.share_failed, 0);
                                    return true;
                                }
                            } else {
                                fromFile = intent.getData();
                            }
                            if (fromFile != null) {
                                A0A(fromFile, null, 8);
                                return true;
                            }
                            Log.w("conversation/video/share/failed");
                            this.A06.A06(R.string.share_failed, 0);
                            return true;
                        } else if (i != 21) {
                            return false;
                        } else {
                            if (intent != null) {
                                A0A(intent.getData(), null, 1);
                            }
                            return true;
                        }
                    }
                }
            }
            A08(i3);
            return true;
        }
    }
}
