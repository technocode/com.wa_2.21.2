package com.whatsapp.mediaview;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.AbstractC07440Xr;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02J;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass05p;
import X.AnonymousClass08B;
import X.AnonymousClass08C;
import X.AnonymousClass08D;
import X.AnonymousClass0AC;
import X.AnonymousClass0AH;
import X.AnonymousClass0BP;
import X.AnonymousClass0BV;
import X.AnonymousClass0BW;
import X.AnonymousClass0CG;
import X.AnonymousClass0CH;
import X.AnonymousClass0DH;
import X.AnonymousClass0ET;
import X.AnonymousClass0EY;
import X.AnonymousClass0FI;
import X.AnonymousClass0FM;
import X.AnonymousClass0HR;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MG;
import X.AnonymousClass0MI;
import X.AnonymousClass0O6;
import X.AnonymousClass0QB;
import X.AnonymousClass0TX;
import X.AnonymousClass0Z6;
import X.AnonymousClass1MC;
import X.AnonymousClass1Ml;
import X.AnonymousClass1PN;
import X.AnonymousClass1VY;
import X.AnonymousClass1Y0;
import X.AnonymousClass214;
import X.AnonymousClass21O;
import X.AnonymousClass232;
import X.AnonymousClass25O;
import X.AnonymousClass2MM;
import X.AnonymousClass2UA;
import X.AnonymousClass2UB;
import X.AnonymousClass2UE;
import X.AnonymousClass2UI;
import X.AnonymousClass2UL;
import X.AnonymousClass2UM;
import X.AnonymousClass35I;
import X.AnonymousClass37G;
import X.AnonymousClass37M;
import X.AnonymousClass3SB;
import X.AnonymousClass3T3;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C006803i;
import X.C007303n;
import X.C014308b;
import X.C02230Bd;
import X.C02580Cq;
import X.C02770Dj;
import X.C02780Dk;
import X.C03270Fn;
import X.C04080Iy;
import X.C04350Ka;
import X.C04360Kb;
import X.C04420Kh;
import X.C06470Tj;
import X.C08500bE;
import X.C10200eF;
import X.C10700f3;
import X.C28301Tu;
import X.C41191ud;
import X.C56832jG;
import X.C57392kE;
import X.C57402kF;
import X.C57422kH;
import X.C57432kI;
import X.C57462kL;
import X.C57482kN;
import X.C57532kS;
import X.C57542kT;
import X.C57612ka;
import X.C60322pF;
import X.C72403Ss;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Conversation;
import com.whatsapp.DeleteMessagesDialogFragment;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.MessageDialogFragment;
import com.whatsapp.VoiceNoteSeekBar;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.crop.CropImage;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediaViewFragment extends MediaViewBaseFragment implements AnonymousClass0MG, AnonymousClass1Ml {
    public static final boolean A1I;
    public static final boolean A1J;
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03 = 0;
    public int A04;
    public long A05;
    public Handler A06;
    public View A07;
    public ImageButton A08;
    public TextView A09;
    public DialogFragment A0A;
    public DialogFragment A0B;
    public VoiceNoteSeekBar A0C;
    public AnonymousClass2MM A0D;
    public AnonymousClass02N A0E;
    public GroupJid A0F;
    public AnonymousClass2UI A0G;
    public AbstractC07440Xr A0H;
    public C007303n A0I;
    public AnonymousClass0M3 A0J;
    public AnonymousClass0M3 A0K;
    public AnonymousClass0M3 A0L;
    public AnonymousClass1Y0 A0M;
    public C72403Ss A0N = null;
    public RunnableEBaseShape0S0310000_I0 A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = true;
    public boolean A0T = true;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final C02780Dk A0Y = C02780Dk.A02();
    public final AnonymousClass009 A0Z = AnonymousClass009.A00();
    public final AnonymousClass02M A0a = AnonymousClass02M.A00();
    public final AnonymousClass1MC A0b = AnonymousClass1MC.A00;
    public final AnonymousClass01I A0c = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A0d = AnonymousClass0Z6.A00();
    public final AnonymousClass0EY A0e = AnonymousClass0EY.A00();
    public final C04350Ka A0f = C04350Ka.A00();
    public final C000300f A0g = C000300f.A00();
    public final C04360Kb A0h = C04360Kb.A00();
    public final AnonymousClass1PN A0i = AnonymousClass1PN.A00();
    public final AnonymousClass08D A0j = AnonymousClass08D.A00();
    public final AnonymousClass0DH A0k = AnonymousClass0DH.A00();
    public final AnonymousClass01A A0l = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0m = new C57532kS(this);
    public final AnonymousClass08B A0n = AnonymousClass08B.A00;
    public final C014308b A0o = C014308b.A00();
    public final AnonymousClass08C A0p = AnonymousClass08C.A00();
    public final AnonymousClass03P A0q = AnonymousClass03P.A00();
    public final C03270Fn A0r = C03270Fn.A00();
    public final AnonymousClass00S A0s = AnonymousClass00S.A00();
    public final AnonymousClass00G A0t = AnonymousClass00G.A01;
    public final AnonymousClass03S A0u = AnonymousClass03S.A00();
    public final AnonymousClass01X A0v = AnonymousClass01X.A00();
    public final AnonymousClass01K A0w = AnonymousClass01K.A00();
    public final AnonymousClass0BV A0x = AnonymousClass0BV.A00();
    public final AnonymousClass019 A0y = new C57542kT(this);
    public final AnonymousClass0AC A0z = AnonymousClass0AC.A00;
    public final AnonymousClass0CG A10 = AnonymousClass0CG.A00();
    public final AnonymousClass0BW A11 = AnonymousClass0BW.A00();
    public final AnonymousClass0M9 A12 = AnonymousClass0M9.A01();
    public final AnonymousClass0ET A13 = AnonymousClass0ET.A00();
    public final AnonymousClass00Y A14 = AnonymousClass00Y.A00();
    public final C02770Dj A15 = C02770Dj.A00();
    public final C04420Kh A16 = C04420Kh.A00();
    public final AnonymousClass0FM A17 = AnonymousClass0FM.A00();
    public final AnonymousClass0CH A18 = AnonymousClass0CH.A00();
    public final AnonymousClass022 A19 = AnonymousClass022.A00();
    public final AnonymousClass02J A1A = AnonymousClass02J.A02();
    public final AnonymousClass35I A1B = AnonymousClass35I.A00();
    public final C02580Cq A1C = C02580Cq.A01();
    public final AnonymousClass00T A1D = C002101e.A00();
    public final Runnable A1E = new RunnableEBaseShape11S0100000_I1_6(this, 2);
    public final HashMap A1F = new HashMap();
    public final Map A1G = new HashMap();
    public final Map A1H = new HashMap();

    static {
        boolean z = false;
        if (!C006803i.A0g()) {
            z = true;
        }
        A1I = z;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT > 23) {
            z2 = true;
        }
        A1J = z2;
    }

    public static int A01(int i) {
        if (i == 1) {
            return R.string.gallery_image_notready_warning;
        }
        if (i == 2) {
            return R.string.gallery_audio_notready_warning;
        }
        if (i == 3) {
            return R.string.gallery_video_notready_warning;
        }
        if (i == 9) {
            return R.string.gallery_document_notready_warning;
        }
        if (i == 13) {
            return R.string.gallery_gif_notready_warning;
        }
        if (i == 42) {
            return R.string.gallery_image_notready_warning;
        }
        if (i != 43) {
            return R.string.gallery_notready_warning;
        }
        return R.string.gallery_video_notready_warning;
    }

    public static MediaViewFragment A02(C007303n r3, AnonymousClass02N r4, boolean z, boolean z2, int i, long j, Bundle bundle, int i2, boolean z3, int i3) {
        MediaViewFragment mediaViewFragment = new MediaViewFragment();
        Bundle bundle2 = new Bundle();
        C006803i.A0T(bundle2, r3, "");
        if (r4 != null) {
            bundle2.putString("jid", r4.getRawString());
        }
        bundle2.putBoolean("gallery", z);
        bundle2.putBoolean("nogallery", z2);
        bundle2.putInt("video_play_origin", i);
        bundle2.putLong("start_t", j);
        bundle2.putBundle("animation_bundle", bundle);
        bundle2.putInt("navigator_type", i3);
        bundle2.putInt("menu_style", i2);
        bundle2.putBoolean("menu_set_wallpaper", z3);
        mediaViewFragment.A0N(bundle2);
        return mediaViewFragment;
    }

    public static final void A03(Menu menu, int i, boolean z) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    public static void A04(MediaViewFragment mediaViewFragment) {
        if (mediaViewFragment.A0W && mediaViewFragment.A0Q) {
            if (mediaViewFragment.A0K != null && mediaViewFragment.A0u.A06()) {
                AnonymousClass0M3 r2 = mediaViewFragment.A0K;
                mediaViewFragment.A0K = null;
                C57402kF r1 = new C57402kF(mediaViewFragment, r2);
                if (!((MediaViewBaseFragment) mediaViewFragment).A0E) {
                    r1.ALF(true);
                } else {
                    ((MediaViewBaseFragment) mediaViewFragment).A0A = r1;
                }
            }
            if (mediaViewFragment.A11()) {
                AnonymousClass0TX.A0E(mediaViewFragment.AMs());
            } else {
                mediaViewFragment.A0J();
            }
        }
    }

    public static void A05(MediaViewFragment mediaViewFragment, InteractiveAnnotation interactiveAnnotation, PhotoView photoView) {
        if (mediaViewFragment != null) {
            AnonymousClass2MM r0 = new AnonymousClass2MM(photoView.getContext(), mediaViewFragment.A15, mediaViewFragment.A0b, (ViewGroup) photoView.getRootView());
            mediaViewFragment.A0D = r0;
            r0.A00(photoView, interactiveAnnotation, null);
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void A0c() {
        A16();
        RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0 = this.A0O;
        if (runnableEBaseShape0S0310000_I0 != null) {
            runnableEBaseShape0S0310000_I0.A03 = true;
            ((Thread) runnableEBaseShape0S0310000_I0.A02).interrupt();
            this.A0O = null;
        }
        C72403Ss r0 = this.A0N;
        if (r0 != null) {
            r0.A06();
            this.A0N = null;
            AnonymousClass0M3 r2 = this.A0L;
            if (r2 != null) {
                this.A18.A08(r2, false, false);
            }
        }
        this.A0L = null;
        this.A0n.A00(this.A0m);
        this.A0z.A00(this.A0y);
        AnonymousClass2UI r02 = this.A0G;
        if (r02 != null) {
            r02.close();
        }
        this.A1D.ANF(new RunnableEBaseShape10S0100000_I1_5(this.A0r, 48));
        AnonymousClass2MM r03 = this.A0D;
        if (r03 != null) {
            r03.A02.dismiss();
        }
        super.A0c();
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        AnonymousClass2UI r0;
        super.A0U = true;
        if (!A1J && this.A0N != null) {
            this.A0a.A02.removeCallbacks(this.A1E);
            this.A0N.A08();
            AnonymousClass37G r02 = this.A0N.A0D;
            if (r02 != null) {
                r02.A01();
            }
        }
        if (A0B().isFinishing() && (r0 = this.A0G) != null) {
            r0.AQE();
        }
        AnonymousClass2MM r03 = this.A0D;
        if (r03 != null) {
            r03.A02.dismiss();
        }
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void A0e() {
        super.A0U = true;
        A0x();
        A10(true, true);
        C72403Ss r0 = this.A0N;
        if (r0 != null) {
            r0.A0G();
            AnonymousClass37G r1 = this.A0N.A0D;
            if (r1 != null && !(r1 instanceof AnonymousClass3T3)) {
                C56832jG r12 = (C56832jG) r1;
                if (!r12.A06) {
                    r12.A0A.A02();
                }
            }
        }
    }

    @Override // X.AnonymousClass037
    public void A0f() {
        C72403Ss r0;
        super.A0U = true;
        if (A1J && (r0 = this.A0N) != null) {
            r0.A0G();
            AnonymousClass37G r1 = this.A0N.A0D;
            if (r1 != null && !(r1 instanceof AnonymousClass3T3)) {
                C56832jG r12 = (C56832jG) r1;
                if (!r12.A06) {
                    r12.A0A.A02();
                }
            }
        }
        ((MediaViewBaseFragment) this).A06.setAlpha(1.0f);
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        AnonymousClass02N r1;
        Intent A012;
        switch (i) {
            case 0:
                if (i2 == -1 && intent != null && intent.getData() != null) {
                    Uri data = intent.getData();
                    AnonymousClass0M3 A122 = A12(this.A03);
                    if (A122 == null) {
                        r1 = null;
                    } else {
                        r1 = A122.A0n.A00;
                    }
                    Context A013 = A01();
                    this.A1A.A06(r1, A013, data, true, 0, 0);
                    C02230Bd.A0R(A013, data);
                    return;
                }
                return;
            case 1:
                if (i2 == -1) {
                    AnonymousClass0EY r12 = this.A0e;
                    AnonymousClass01I r0 = this.A0c;
                    r0.A04();
                    AnonymousClass0HR r02 = r0.A01;
                    if (r02 == null) {
                        throw null;
                    } else if (r12.A09(r02)) {
                        ProgressDialogFragment A002 = ProgressDialogFragment.A00(0, R.string.updating_profile_photo_dialog_title);
                        this.A0B = A002;
                        AnonymousClass0QB r3 = new AnonymousClass0QB(A0C());
                        r3.A0A(0, A002, "photo_progress_fragment", 1);
                        r3.A01();
                        return;
                    } else {
                        return;
                    }
                } else if (i2 == 0 && intent != null) {
                    AnonymousClass0EY r03 = this.A0e;
                    CropImage.A00(r03.A02, intent, AMs(), r03.A0C);
                    return;
                } else {
                    return;
                }
            case 2:
                if (i2 == -1 && intent != null) {
                    this.A0F = GroupJid.getNullable(intent.getStringExtra("contact"));
                    AnonymousClass0M3 r04 = (AnonymousClass0M3) this.A0w.A0J.A01(intent.getLongExtra("message_row_id", -1));
                    Intent intent2 = new Intent();
                    if (r04 != null) {
                        AnonymousClass0M4 r05 = r04.A02;
                        if (r05 != null) {
                            intent2.setData(Uri.fromFile(r05.A0F));
                            AnonymousClass0EY r32 = this.A0e;
                            Context A003 = A00();
                            if (A003 != null && (A012 = r32.A01(A003, AMs(), intent2)) != null) {
                                A0M(A012, 3, null);
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    Log.e("mediaview/no-message-for-group-icon");
                    this.A0a.A06(R.string.failed_update_photo, 0);
                    return;
                }
                return;
            case 3:
                if (i2 == -1) {
                    GroupJid groupJid = this.A0F;
                    if (groupJid != null && this.A0e.A09(this.A0l.A0A(groupJid))) {
                        ProgressDialogFragment A004 = ProgressDialogFragment.A00(0, R.string.updating_group_icon_dialog_title);
                        this.A0A = A004;
                        AnonymousClass0QB r33 = new AnonymousClass0QB(A0C());
                        r33.A0A(0, A004, "group_progress_fragment", 1);
                        r33.A01();
                        return;
                    }
                    return;
                } else if (i2 == 0 && intent != null) {
                    AnonymousClass0EY r06 = this.A0e;
                    CropImage.A00(r06.A02, intent, AMs(), r06.A0C);
                    return;
                } else {
                    return;
                }
            case 4:
                if (i2 == -1 && intent != null) {
                    C007303n A082 = C006803i.A08(intent);
                    AbstractC007503q A123 = A12(this.A03);
                    if ((A123 == null || A123.A0n != A082) && (A123 = this.A0w.A0J.A05(A082)) == null) {
                        Log.w("mediaview/forward/failed");
                        this.A0a.A06(R.string.message_forward_failed, 0);
                        return;
                    }
                    List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
                    this.A0h.A09(this.A0f, A123, A0G2);
                    A1C(A0G2);
                    return;
                }
                return;
            case 5:
                if (i2 == -1 && intent != null) {
                    A1C(AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids")));
                    return;
                }
                return;
            case 6:
                if (i2 == -1 && intent != null && intent.getData() != null) {
                    Uri data2 = intent.getData();
                    AnonymousClass02N A083 = AnonymousClass1VY.A08(intent);
                    Context A014 = A01();
                    this.A1A.A06(A083, A014, data2, true, 0, 0);
                    C02230Bd.A0R(A014, data2);
                    A0t();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // X.AnonymousClass037
    public void A0h(Intent intent) {
        AnonymousClass2UI r0 = this.A0G;
        if (r0 != null) {
            r0.AHr();
        }
        super.A0h(intent);
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void A0i(Bundle bundle) {
        this.A1D.ANF(new RunnableEBaseShape10S0100000_I1_5(this.A0r, 48));
        super.A0i(bundle);
        RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0 = new RunnableEBaseShape0S0310000_I0(this);
        this.A0O = runnableEBaseShape0S0310000_I0;
        ((Thread) runnableEBaseShape0S0310000_I0.A02).start();
        boolean z = false;
        if (bundle != null) {
            z = true;
        }
        this.A0P = z;
        A0I();
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        GroupJid groupJid = this.A0F;
        if (groupJid != null) {
            bundle.putString("gid", groupJid.getRawString());
        }
        bundle.putBoolean("is_different_video", this.A0S);
    }

    @Override // X.AnonymousClass037
    public void A0k(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        if (this.A02 == 3) {
            AnonymousClass01X r7 = this.A0v;
            menu.add(0, 14, 1, r7.A06(R.string.info)).setIcon(C002001d.A0b(A01(), R.drawable.ic_viewonce_ephemeral, R.color.white)).setShowAsAction(2);
            menu.add(0, 6, 0, r7.A06(R.string.delete));
            return;
        }
        AnonymousClass01X r2 = this.A0v;
        menu.add(0, 10, 0, r2.A06(R.string.add_star)).setIcon(R.drawable.ic_media_unstarred).setShowAsAction(2);
        menu.add(0, 11, 0, r2.A06(R.string.remove_star)).setIcon(R.drawable.ic_media_starred).setShowAsAction(2);
        if (this.A02 == 2) {
            menu.add(0, 6, 0, r2.A06(R.string.delete)).setIcon(R.drawable.ic_action_delete).setShowAsAction(2);
        } else {
            menu.add(0, 9, 0, r2.A06(R.string.conversation_menu_forward)).setIcon(R.drawable.ic_media_forward).setShowAsAction(2);
        }
        if (this.A0g.A0D(AbstractC000400g.A1V)) {
            Drawable A0d2 = C002001d.A0d(AnonymousClass05p.A01(A01(), R.drawable.ic_text_status_compose));
            C002001d.A2Z(A0d2, -1);
            menu.add(0, 13, 0, r2.A06(R.string.edit)).setIcon(A0d2).setShowAsAction(1);
        }
        menu.add(0, 7, 0, r2.A06(R.string.all_media)).setIcon(R.drawable.ic_action_all_media).setShowAsAction(0);
        menu.add(0, 12, 0, r2.A06(R.string.view_in_chat)).setShowAsAction(0);
        menu.add(0, 8, 0, r2.A06(R.string.share)).setIcon(R.drawable.ic_action_share);
        SubMenu addSubMenu = menu.addSubMenu(1, 0, 0, r2.A06(R.string.set_as));
        addSubMenu.clearHeader();
        addSubMenu.add(1, 4, 0, r2.A06(R.string.set_as_profile_photo_wa_gallery));
        addSubMenu.add(1, 5, 0, r2.A06(R.string.set_as_group_icon_wa_gallery));
        if (this.A0U) {
            addSubMenu.add(1, 1, 0, r2.A06(R.string.use_as_wallpaper));
        }
        menu.add(1, 2, 0, r2.A06(R.string.view_in_gallery));
        menu.add(1, 3, 0, r2.A06(R.string.rotate));
        if (this.A02 != 2) {
            menu.add(0, 6, 0, r2.A06(R.string.delete));
        }
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        int i;
        super.A0l(view, bundle);
        if (((MediaViewBaseFragment) this).A0C != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("mediaview/oncreate/oom/heap size:");
            A0S2.append(Debug.getNativeHeapAllocatedSize() / 1024);
            A0S2.append(" kB");
            Log.e(A0S2.toString());
            AnonymousClass08C r3 = this.A0p;
            StringBuilder A0S3 = AnonymousClass008.A0S("native heap size:");
            A0S3.append(Debug.getNativeHeapAllocatedSize() / 1024);
            A0S3.append(" kB");
            Log.e(A0S3.toString());
            r3.A02.A02().A00.A06(0);
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("title_id", 0);
            bundle2.putInt("message_id", R.string.error_low_on_memory);
            messageDialogFragment.A0N(bundle2);
            messageDialogFragment.A0u(A0C(), "oom_fragment");
            return;
        }
        Bundle bundle3 = ((AnonymousClass037) this).A06;
        if (bundle3 == null) {
            throw null;
        } else if (!this.A0u.A06()) {
            A0t();
        } else {
            C007303n A092 = C006803i.A09(bundle3, "");
            if (A092 != null) {
                this.A0I = A092;
                this.A0E = AnonymousClass02N.A01(bundle3.getString("jid"));
                this.A0V = bundle3.getBoolean("nogallery", false);
                this.A05 = bundle3.getLong("start_t", 0);
                this.A0R = bundle3.getBoolean("gallery", false);
                int i2 = bundle3.getInt("video_play_origin");
                if (i2 == 1) {
                    i = 1;
                } else if (i2 != 2) {
                    i = 3;
                    if (i2 != 3) {
                        i = 4;
                        if (i2 != 4) {
                            i = 5;
                            if (i2 != 5) {
                                StringBuilder sb = new StringBuilder("videoplayorigin=");
                                sb.append(i2);
                                sb.append(" not in range");
                                Log.d(sb.toString());
                            }
                        }
                    }
                } else {
                    i = 2;
                }
                this.A04 = i;
                int i3 = bundle3.getInt("navigator_type");
                this.A02 = bundle3.getInt("menu_style");
                this.A0U = bundle3.getBoolean("menu_set_wallpaper", false);
                if (i3 == 1) {
                    if (this.A0E == null) {
                        Log.e("mediaview/oncreate/jid navigatorfactory with null jid");
                        A0t();
                        return;
                    }
                    this.A0H = new C57422kH(this);
                } else if (i3 == 2) {
                    SearchViewModel searchViewModel = (SearchViewModel) new AnonymousClass0O6(A0B()).A00(SearchViewModel.class);
                    this.A0H = searchViewModel;
                    super.A0K.A00(searchViewModel);
                }
                if (this.A0H == null) {
                    Log.e("mediaview/oncreate/null navigatorfactory");
                    A0t();
                    return;
                }
                if (this.A0V) {
                    ((MediaViewBaseFragment) this).A02.setVisibility(8);
                }
                if (bundle != null) {
                    this.A0S = bundle.getBoolean("is_different_video", true);
                }
                StringBuilder A0S4 = AnonymousClass008.A0S("mediaview/found-key ");
                A0S4.append(this.A0I.A00);
                A0S4.append(" me:");
                C007303n r1 = this.A0I;
                A0S4.append(r1.A02);
                A0S4.append(" id:");
                AnonymousClass008.A1U(A0S4, r1.A01);
                AnonymousClass01K r0 = this.A0w;
                AnonymousClass0M3 r4 = (AnonymousClass0M3) r0.A0J.A05(this.A0I);
                if (r4 == null) {
                    StringBuilder A0S5 = AnonymousClass008.A0S("mediaview/cannot find message for ");
                    A0S5.append(this.A0I);
                    Log.e(A0S5.toString());
                    A0t();
                    return;
                }
                byte b = r4.A0m;
                if (b == 2 || AnonymousClass0FI.A0G(b) || b == 9 || AnonymousClass0FI.A0E(b)) {
                    this.A0K = r4;
                }
                StringBuilder A0S6 = AnonymousClass008.A0S("mediaview/view message:");
                A0S6.append(this.A0I);
                Log.i(A0S6.toString());
                AnonymousClass2UI A3P = this.A0H.A3P(this, r4);
                this.A0G = A3P;
                A3P.AOB(new RunnableEBaseShape11S0100000_I1_6(this, 5));
                C08500bE r12 = new C08500bE(this, new C57612ka(this));
                ((MediaViewBaseFragment) this).A08 = r12;
                ((MediaViewBaseFragment) this).A09.setAdapter(r12);
                ((MediaViewBaseFragment) this).A09.A0B(0, false);
                A17(this.A0G.A8U(this.A0I));
                if (!this.A0V) {
                    this.A0G.AQ4();
                }
                this.A0L = r4;
                if (b == 3 || b == 1) {
                    this.A1D.ANF(new RunnableEBaseShape8S0200000_I1_3(this, r4, 27));
                }
                this.A06 = new Handler(Looper.getMainLooper(), new AnonymousClass2UB(this));
                if (this.A0P) {
                    this.A0K = null;
                }
                this.A0L = this.A0K;
                A18(this.A03);
                if (!this.A0P) {
                    this.A0J = r4;
                    Bundle bundle4 = ((MediaViewBaseFragment) this).A01;
                    if (bundle4 != null) {
                        ((MediaViewBaseFragment) this).A0E = true;
                        ((MediaViewBaseFragment) this).A0B.A0A(this, bundle4);
                    }
                }
                if (bundle != null) {
                    this.A0F = GroupJid.getNullable(bundle.getString("gid"));
                }
                this.A0n.A01(this.A0m);
                this.A0z.A01(this.A0y);
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        int A002;
        int height;
        long j;
        Intent A012;
        switch (menuItem.getItemId()) {
            case 1:
                AnonymousClass0M3 A122 = A12(this.A03);
                if (A122 != null) {
                    if (A02().getConfiguration().orientation == 1) {
                        int height2 = A0B().getWindow().getDecorView().getHeight() - ((int) A02().getDimension(R.dimen.header_height));
                        if (C002301g.A0K != null) {
                            A002 = height2 - C002301g.A00(A01());
                            height = A0B().getWindow().getDecorView().getWidth();
                        } else {
                            throw null;
                        }
                    } else {
                        int width = A0B().getWindow().getDecorView().getWidth() - ((int) A02().getDimension(R.dimen.header_height));
                        if (C002301g.A0K != null) {
                            A002 = width - C002301g.A00(A01());
                            height = A0B().getWindow().getDecorView().getHeight();
                        } else {
                            throw null;
                        }
                    }
                    AnonymousClass0M4 r0 = A122.A02;
                    if (r0 != null) {
                        Uri fromFile = Uri.fromFile(r0.A0F);
                        if (this.A0g.A0D(AbstractC000400g.A2e)) {
                            AnonymousClass02N r7 = A122.A0n.A00;
                            ActivityC004902h A0B2 = A0B();
                            Uri A042 = this.A1A.A04();
                            Intent intent = new Intent(A0B2, GalleryWallpaperPreview.class);
                            intent.setData(fromFile);
                            intent.putExtra("output", A042);
                            intent.putExtra("chat_jid", r7);
                            intent.putExtra("is_using_global_wallpaper", true);
                            A0M(intent, 6, null);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("mediaview/wallpaper/crop/height:");
                        sb.append(A002);
                        Log.i(sb.toString());
                        Intent intent2 = new Intent(A01(), CropImage.class);
                        intent2.putExtra("outputX", height);
                        intent2.putExtra("outputY", A002);
                        intent2.putExtra("scale", 1);
                        intent2.putExtra("scaleUpIfNeeded", true);
                        intent2.putExtra("cropByOutputSize", true);
                        intent2.setData(fromFile);
                        intent2.putExtra("output", this.A1A.A04());
                        intent2.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                        A0M(intent2, 0, null);
                        return true;
                    }
                    throw null;
                }
                Log.e("mediaview/no-message-to-set-as-wallpaper");
                return true;
            case 2:
                AnonymousClass0M3 A123 = A12(this.A03);
                if (A123 != null) {
                    AnonymousClass02M r72 = this.A0a;
                    r72.A05(0, R.string.loading_spinner);
                    AnonymousClass009 r1 = this.A0Z;
                    AnonymousClass00T r5 = this.A1D;
                    AnonymousClass0BW r02 = this.A11;
                    C57462kL r4 = new C57462kL(this, A123);
                    C60322pF r2 = new C60322pF(r1, r02, A123);
                    ((C41191ud) r2).A01.A03(r4, r72.A06);
                    r5.ANF(r2);
                    return true;
                }
                Log.e("mediaview/no-message-to-view-in-gallery");
                return true;
            case 3:
                if (A12(this.A03) instanceof AnonymousClass0MI) {
                    AnonymousClass0MI r03 = (AnonymousClass0MI) A12(this.A03);
                    if (r03 != null) {
                        this.A1D.ANC(new C10200eF(this, r03), new Void[0]);
                        return true;
                    }
                    throw null;
                }
                break;
            case 4:
                AnonymousClass0M3 A124 = A12(this.A03);
                if (A124 != null) {
                    Intent intent3 = new Intent();
                    AnonymousClass0M4 r04 = A124.A02;
                    if (r04 != null) {
                        intent3.setData(Uri.fromFile(r04.A0F));
                        AnonymousClass0EY r22 = this.A0e;
                        Context A003 = A00();
                        if (!(A003 == null || (A012 = r22.A01(A003, AMs(), intent3)) == null)) {
                            A0M(A012, 1, null);
                            return true;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    Log.e("mediaview/no-message-to-set-as-profile-photo");
                    return true;
                }
            case 5:
                Intent intent4 = new Intent(A01(), ContactPicker.class);
                intent4.putExtra("set_group_icon", true);
                intent4.putExtra("message_row_id", A12(this.A03).A0p);
                A0M(intent4, 2, null);
                return true;
            case 6:
                AnonymousClass0M3 A125 = A12(this.A03);
                if (A125 != null) {
                    List<AbstractC007503q> singletonList = Collections.singletonList(A125);
                    if (this.A02 == 2) {
                        this.A1D.ANC(new C10700f3(this.A0x, singletonList, new C04080Iy(), new C57432kI(this, singletonList)), new Void[0]);
                        return true;
                    }
                    AnonymousClass02N r73 = this.A0E;
                    DeleteMessagesDialogFragment deleteMessagesDialogFragment = new DeleteMessagesDialogFragment();
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC007503q r05 : singletonList) {
                        arrayList.add(r05.A0n);
                    }
                    C006803i.A0U(bundle, arrayList);
                    if (r73 != null) {
                        bundle.putString("jid", r73.getRawString());
                    }
                    bundle.putBoolean("is_revokable", true);
                    deleteMessagesDialogFragment.A0N(bundle);
                    deleteMessagesDialogFragment.A0u(A0C(), null);
                    return true;
                }
                break;
            case 7:
                A0w();
                return true;
            case 8:
                this.A0h.A05(A0B(), this.A0Y, A12(this.A03));
                return true;
            case 9:
                AnonymousClass0M3 A126 = A12(this.A03);
                if (A126 != null) {
                    Intent intent5 = new Intent(A01(), ContactPicker.class);
                    intent5.putExtra("forward", true);
                    AnonymousClass02N r06 = this.A0E;
                    if (r06 != null) {
                        intent5.putExtra("forward_jid", r06.getRawString());
                    }
                    byte b = A126.A0m;
                    intent5.putIntegerArrayListExtra("message_types", new ArrayList<>(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue()))));
                    if (b == 3) {
                        j = ((long) A126.A00) * 1000;
                    } else {
                        j = 0;
                    }
                    intent5.putExtra("forward_video_duration", j);
                    C006803i.A05(intent5, A126.A0n);
                    A0M(intent5, 4, null);
                    return true;
                }
                Log.e("mediaview/no-message-for-forward");
                return true;
            case 10:
                AnonymousClass0M3 A127 = A12(this.A03);
                if (A127 != null) {
                    AnonymousClass214 r12 = new AnonymousClass214();
                    r12.A00 = Integer.valueOf(AnonymousClass0AH.A01(A127));
                    r12.A01 = 1;
                    this.A14.A0B(r12, null, false);
                    this.A1D.ANF(new RunnableEBaseShape8S0200000_I1_3(this, A127, 26));
                    return true;
                }
                Log.e("mediaview/no-message-for-star");
                return true;
            case 11:
                AnonymousClass0M3 A128 = A12(this.A03);
                if (A128 != null) {
                    this.A1D.ANF(new RunnableEBaseShape8S0200000_I1_3(this, A128, 25));
                    return true;
                }
                Log.e("mediaview/no-message-for-unstar");
                return true;
            case 12:
                AnonymousClass0M3 A129 = A12(this.A03);
                if (A129 != null) {
                    long A032 = AnonymousClass0FI.A03(A129);
                    Context A013 = A01();
                    C007303n r23 = A129.A0n;
                    Intent A052 = Conversation.A05(A013, r23.A00);
                    A052.putExtra("row_id", A032);
                    C006803i.A05(A052, r23);
                    AnonymousClass2UI r07 = this.A0G;
                    if (r07 != null) {
                        r07.AHr();
                    }
                    super.A0h(A052);
                    return true;
                }
                Log.e("mediaview/no-message-to-view-in-chat");
                return true;
            case 13:
                AnonymousClass0M3 A1210 = A12(this.A03);
                if (A1210 != null) {
                    ((MediaViewBaseFragment) this).A06.animate().alpha(0.0f).setDuration(100).setListener(new AnonymousClass2UL(this, A1210));
                    return true;
                }
                Log.e("mediaview/no-message-for-edit");
                return true;
            case 14:
                AnonymousClass0MB r24 = new AnonymousClass0MB(A01());
                r24.A01(R.string.view_once_info);
                AnonymousClass01X r13 = this.A0v;
                r24.A07(r13.A06(R.string.ok), null);
                r24.A06(r13.A06(R.string.learn_more), new AnonymousClass2UE(this));
                r24.A01.A0J = true;
                r24.A00().show();
                return true;
        }
        return true;
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment
    public void A0s() {
        View findViewWithTag;
        AnonymousClass0M3 A122 = A12(this.A03);
        if (!(A122 == null || (findViewWithTag = ((MediaViewBaseFragment) this).A09.findViewWithTag(A122.A0n)) == null)) {
            View findViewById = findViewWithTag.findViewById(R.id.thumbnail);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                findViewById.setAlpha(1.0f);
            }
            View findViewById2 = findViewWithTag.findViewById(R.id.video_view);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        super.A0s();
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment
    public void A0t() {
        super.A0t();
        Map map = this.A1G;
        for (AnonymousClass37M r0 : map.values()) {
            r0.A08();
        }
        map.clear();
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment
    public void A0w() {
        if (this.A0E == null || (this.A0R && this.A0J != null)) {
            A0v();
            return;
        }
        this.A0J = null;
        Intent intent = new Intent(A01(), MediaGalleryActivity.class);
        intent.putExtra("jid", this.A0E.getRawString());
        AnonymousClass2UI r0 = this.A0G;
        if (r0 != null) {
            r0.AHr();
        }
        super.A0h(intent);
        A0t();
    }

    public final AnonymousClass0M3 A12(int i) {
        AnonymousClass2UI r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        return r0.A7O(i);
    }

    public final void A13() {
        AnonymousClass1Y0 r2 = this.A0M;
        if (r2 != null && this.A01 != 2) {
            r2.A03();
            A15();
            this.A01 = 2;
        }
    }

    public final void A14() {
        ImageButton imageButton = this.A08;
        if (imageButton != null) {
            AnonymousClass01X r2 = this.A0v;
            imageButton.setImageDrawable(new C06470Tj(r2, C004302a.A03(A01(), R.drawable.mviewer_pause)));
            this.A08.setContentDescription(r2.A06(R.string.pause));
        }
        View view = this.A07;
        if (view != null) {
            C002001d.A2w(this.A0v, view, R.string.pause);
        }
    }

    public final void A15() {
        ImageButton imageButton = this.A08;
        if (imageButton != null) {
            AnonymousClass01X r2 = this.A0v;
            imageButton.setImageDrawable(new C06470Tj(r2, C004302a.A03(A01(), R.drawable.mviewer_play)));
            this.A08.setContentDescription(r2.A06(R.string.play));
        }
        View view = this.A07;
        if (view != null) {
            C002001d.A2w(this.A0v, view, R.string.play);
        }
    }

    public final void A16() {
        AnonymousClass1Y0 r0 = this.A0M;
        if (r0 != null) {
            r0.A05();
            this.A0M = null;
            this.A01 = 0;
        }
        VoiceNoteSeekBar voiceNoteSeekBar = this.A0C;
        if (voiceNoteSeekBar != null) {
            voiceNoteSeekBar.setProgress(0);
        }
        A15();
        TextView textView = this.A09;
        if (textView != null) {
            textView.setText(C002001d.A1W(this.A0v, 0));
        }
    }

    public void A17(int i) {
        StringBuilder A0S2 = AnonymousClass008.A0S("mediaview/getmsgtask/msglist-size ");
        A0S2.append(this.A0G.getCount());
        A0S2.append(" pos=");
        A0S2.append(i);
        Log.d(A0S2.toString());
        this.A03 = i;
        A0u();
        ((MediaViewBaseFragment) this).A09.A0B(i, false);
        A0B().invalidateOptionsMenu();
        ((MediaViewBaseFragment) this).A02.setVisibility(8);
    }

    public final void A18(int i) {
        AnonymousClass0M3 A7O;
        String A062;
        AnonymousClass2UI r0 = this.A0G;
        if (r0 != null && (A7O = r0.A7O(i)) != null) {
            AnonymousClass2UI r02 = this.A0G;
            if (r02 != null) {
                r02.AQq(i);
            }
            if (A7O.A0n.A02) {
                A062 = this.A0v.A06(R.string.you);
            } else {
                UserJid A082 = A7O.A08();
                if (A082 != null) {
                    A062 = this.A0o.A08(this.A0l.A0A(A082), false);
                } else {
                    AnonymousClass02N r2 = this.A0E;
                    if (r2 != null) {
                        A062 = this.A0o.A08(this.A0l.A0A(r2), false);
                    } else {
                        Log.e("mediaview/no sender and no jid");
                        this.A0Z.A03("null_jid_no_sender", 5);
                        A062 = this.A0v.A06(R.string.unknown);
                    }
                }
            }
            ((MediaViewBaseFragment) this).A07.setText(A062);
            ((MediaViewBaseFragment) this).A05.setText(C002001d.A1F(this.A0v, this.A0s.A06(A7O.A0E)));
            A0B().invalidateOptionsMenu();
        }
    }

    public final void A19(AnonymousClass0M3 r7) {
        View findViewWithTag;
        StringBuilder A0S2 = AnonymousClass008.A0S("mediaview/prepareaudioplayback/");
        C007303n r1 = r7.A0n;
        AnonymousClass008.A1U(A0S2, r1.A01);
        if (this.A0u.A06() && (findViewWithTag = ((MediaViewBaseFragment) this).A09.findViewWithTag(r1)) != null) {
            this.A09 = (TextView) findViewWithTag.findViewById(R.id.progress_tv);
            VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) findViewWithTag.findViewById(R.id.audio_seekbar);
            this.A0C = voiceNoteSeekBar;
            voiceNoteSeekBar.setOnSeekBarChangeListener(new AnonymousClass2UM(this));
            ImageButton imageButton = (ImageButton) findViewWithTag.findViewById(R.id.audio_control_btn);
            this.A08 = imageButton;
            ViewOnClickEBaseShape2S0200000_I1_1 viewOnClickEBaseShape2S0200000_I1_1 = new ViewOnClickEBaseShape2S0200000_I1_1(this.A0C, this, 2);
            imageButton.setOnClickListener(viewOnClickEBaseShape2S0200000_I1_1);
            View findViewById = findViewWithTag.findViewById(R.id.audio_icon);
            this.A07 = findViewById;
            if (((MediaViewBaseFragment) this).A0G) {
                findViewById.setOnClickListener(viewOnClickEBaseShape2S0200000_I1_1);
            } else {
                findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, viewOnClickEBaseShape2S0200000_I1_1, 1));
            }
            AnonymousClass1Y0 r0 = this.A0M;
            if (r0 != null) {
                r0.A05();
                this.A0M = null;
            }
            try {
                AnonymousClass0M4 r02 = r7.A02;
                if (r02 != null) {
                    File file = r02.A0F;
                    if (file != null) {
                        AnonymousClass1Y0 A002 = AnonymousClass1Y0.A00(file, 3);
                        this.A0M = A002;
                        AnonymousClass2UA r12 = AnonymousClass2UA.A00;
                        if (!(A002 instanceof AnonymousClass3SB)) {
                            ((AnonymousClass232) A002).A00.setOnErrorListener(r12);
                        }
                        this.A0M.A04();
                        StringBuilder sb = new StringBuilder();
                        sb.append("mediaview/audio duration:");
                        sb.append(this.A0M.A02());
                        Log.i(sb.toString());
                        this.A01 = 2;
                        this.A09.setText(C002001d.A1W(this.A0v, (long) (this.A0M.A02() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
                        this.A0C.setMax(this.A0M.A02());
                    } else {
                        Log.e("mediaview/ audio file is null");
                        AMs().APo(R.string.gallery_audio_cannot_load);
                    }
                    this.A0C.setProgress(0);
                    A15();
                    return;
                }
                throw null;
            } catch (IOException e) {
                Log.e("mediaview/prepare fail", e);
                AnonymousClass1Y0 r03 = this.A0M;
                if (r03 != null) {
                    r03.A05();
                    this.A0M = null;
                }
                AMs().APo(R.string.gallery_audio_cannot_load);
            }
        }
    }

    public final void A1A(AnonymousClass0M3 r13, int i, boolean z) {
        C72403Ss r1;
        int i2;
        C28301Tu.A03();
        boolean z2 = A1I;
        if (z2 || !AnonymousClass0FI.A0G(r13.A0m)) {
            byte b = r13.A0m;
            if (!z2) {
                if (AnonymousClass0FI.A0E(b)) {
                    AnonymousClass37M r0 = (AnonymousClass37M) this.A1G.get(r13.A0n);
                    if (r0 != null) {
                        r0.A07();
                        return;
                    }
                    return;
                }
            } else if ((AnonymousClass0FI.A0G(b) || AnonymousClass0FI.A0E(b)) && z && (r1 = this.A0N) != null) {
                r1.A04 = this.A04;
                r1.A08();
                C72403Ss r02 = this.A0N;
                AnonymousClass25O r2 = r02.A08;
                if (r2 != null) {
                    r2.ANW((long) i);
                } else {
                    r02.A03 = i;
                }
                this.A0N.A07();
                A0B().invalidateOptionsMenu();
                return;
            }
            if (b == 2) {
                A19(r13);
                if (this.A0M != null) {
                    this.A1B.A01();
                    try {
                        this.A0M.A06();
                        if (i > 0) {
                            this.A0M.A07(i);
                            this.A0C.setProgress(this.A0M.A01());
                        }
                        this.A01 = 1;
                        this.A06.sendEmptyMessage(0);
                        A14();
                    } catch (IOException e) {
                        Log.e("mediaview/playMedia failed to start", e);
                        AMs().APo(R.string.gallery_audio_cannot_load);
                    }
                }
            } else if (b == 9) {
                Log.i("mediaview/playMedia trying to open document");
                AnonymousClass02M r5 = this.A0a;
                r5.A05(0, R.string.loading_spinner);
                AnonymousClass009 r12 = this.A0Z;
                AnonymousClass00T r4 = this.A1D;
                AnonymousClass0BW r03 = this.A11;
                C57392kE r3 = new C57392kE(this, r13);
                C60322pF r22 = new C60322pF(r12, r03, r13);
                ((C41191ud) r22).A01.A03(r3, r5.A06);
                r4.ANF(r22);
            }
        } else {
            AnonymousClass02M r7 = this.A0a;
            r7.A05(0, R.string.loading_spinner);
            AnonymousClass009 r14 = this.A0Z;
            AnonymousClass00T r6 = this.A1D;
            AnonymousClass0BW r04 = this.A11;
            C57482kN r52 = new C57482kN(this);
            C60322pF r42 = new C60322pF(r14, r04, r13);
            ((C41191ud) r42).A01.A03(r52, r7.A06);
            r6.ANF(r42);
            AnonymousClass0M4 r43 = r13.A02;
            if (r43 != null) {
                if (this.A0S) {
                    AnonymousClass0ET r62 = this.A13;
                    int i3 = 1;
                    if (r13.A0n.A02) {
                        i3 = 3;
                    }
                    if (z) {
                        i2 = this.A04;
                    } else {
                        i2 = 4;
                    }
                    long j = (long) r13.A00;
                    File file = r43.A0F;
                    if (r62 == null) {
                        throw null;
                    } else if (file != null) {
                        AnonymousClass21O r53 = new AnonymousClass21O();
                        r53.A05 = Long.valueOf(j);
                        r53.A04 = Long.valueOf((System.currentTimeMillis() - file.lastModified()) / 1000);
                        r53.A03 = Integer.valueOf(i3);
                        r53.A02 = 1;
                        r53.A01 = Integer.valueOf(i2);
                        r53.A00 = Double.valueOf((double) file.length());
                        r62.A09.A0B(r53, null, false);
                    }
                }
                this.A0S = false;
                return;
            }
            throw null;
        }
    }

    public void A1B(C72403Ss r5, ExoPlaybackControlView exoPlaybackControlView, int i) {
        ExoPlaybackControlView exoPlaybackControlView2;
        ExoPlaybackControlView exoPlaybackControlView3;
        if (!r5.A0G) {
            return;
        }
        if ((i & 4) == 0) {
            A10(true, false);
            for (C72403Ss r0 : this.A1H.values()) {
                if (!(r0 == r5 || (exoPlaybackControlView3 = r0.A0C) == null)) {
                    exoPlaybackControlView3.A0A.setVisibility(0);
                    if (exoPlaybackControlView3.A06) {
                        exoPlaybackControlView3.A09.setVisibility(0);
                    }
                    exoPlaybackControlView3.A04();
                    exoPlaybackControlView3.A03();
                    exoPlaybackControlView3.A05();
                }
            }
            if (Build.VERSION.SDK_INT < 19 && exoPlaybackControlView.getVisibility() != 0) {
                exoPlaybackControlView.A01();
                exoPlaybackControlView.A06(3000);
                return;
            }
            return;
        }
        A10(false, false);
        for (C72403Ss r02 : this.A1H.values()) {
            if (!(r02 == r5 || (exoPlaybackControlView2 = r02.A0C) == null)) {
                exoPlaybackControlView2.A02();
            }
        }
    }

    public final void A1C(List list) {
        if (list.size() != 1 || AnonymousClass1VY.A0b((Jid) list.get(0))) {
            AMs().A0S(list);
        } else {
            A0h(Conversation.A04(A01(), this.A0l.A0A((AnonymousClass02N) list.get(0))));
        }
    }

    @Override // X.AnonymousClass0MG
    public void AEu() {
        A16();
        C72403Ss r1 = this.A0N;
        if (!(r1 == null || this.A0L == null)) {
            r1.A08();
            this.A0N.A06();
            this.A1H.remove(this.A0L.A0n);
            this.A1F.remove(this.A0L.A0n);
            this.A0N = null;
        }
        AnonymousClass2UI r0 = this.A0G;
        if (r0 == null || r0.getCount() == 1) {
            A0t();
        }
    }

    @Override // X.AnonymousClass1Ml
    public boolean AL1(int i) {
        if (i != R.string.error_low_on_memory) {
            return false;
        }
        A0t();
        return true;
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass2MM r0 = this.A0D;
        if (r0 != null) {
            r0.A02.dismiss();
        }
    }
}
