package com.whatsapp.storage;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.AbstractC06100Rs;
import X.AbstractC06110Rt;
import X.AbstractC43421yL;
import X.AbstractC658531u;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass0AC;
import X.AnonymousClass0BV;
import X.AnonymousClass0CG;
import X.AnonymousClass0CH;
import X.AnonymousClass0D1;
import X.AnonymousClass0DH;
import X.AnonymousClass0EO;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0LW;
import X.AnonymousClass0MO;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass0S5;
import X.AnonymousClass0YX;
import X.AnonymousClass0Z6;
import X.AnonymousClass1KQ;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2IC;
import X.AnonymousClass2L5;
import X.AnonymousClass2L6;
import X.AnonymousClass31y;
import X.AnonymousClass320;
import X.AnonymousClass322;
import X.AnonymousClass325;
import X.AnonymousClass3RO;
import X.AnonymousClass3RQ;
import X.AnonymousClass3RZ;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C006803i;
import X.C007003k;
import X.C007303n;
import X.C014308b;
import X.C02780Dk;
import X.C04080Iy;
import X.C04360Kb;
import X.C04420Kh;
import X.C10700f3;
import X.C28051Sr;
import X.C47612Is;
import X.C51822a5;
import X.C71973Ra;
import X.C74243aQ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StorageUsageGalleryActivity extends ActivityC004602e implements AbstractC43421yL {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public AbstractC06100Rs A05;
    public AbstractC06110Rt A06;
    public C04080Iy A07;
    public AnonymousClass0YX A08;
    public C47612Is A09;
    public C10700f3 A0A;
    public C007003k A0B;
    public ProgressDialogFragment A0C;
    public AnonymousClass02N A0D;
    public StorageUsageMediaGalleryFragment A0E;
    public Runnable A0F;
    public Runnable A0G;
    public String A0H;
    public final Handler A0I = new Handler(Looper.getMainLooper());
    public final AnonymousClass01I A0J = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A0K = AnonymousClass0Z6.A00();
    public final C04360Kb A0L = C04360Kb.A00();
    public final AnonymousClass0DH A0M = AnonymousClass0DH.A00();
    public final AnonymousClass01A A0N = AnonymousClass01A.A00();
    public final C014308b A0O = C014308b.A00();
    public final AnonymousClass0L2 A0P = AnonymousClass0L2.A01();
    public final AnonymousClass2IC A0Q = AnonymousClass2IC.A00();
    public final AnonymousClass01K A0R = AnonymousClass01K.A00();
    public final AnonymousClass01T A0S = AnonymousClass01T.A00();
    public final AnonymousClass0BV A0T = AnonymousClass0BV.A00();
    public final AnonymousClass019 A0U = new AnonymousClass3RZ(this);
    public final AnonymousClass0AC A0V = AnonymousClass0AC.A00;
    public final AnonymousClass0CG A0W = AnonymousClass0CG.A00();
    public final AnonymousClass2L5 A0X = new C71973Ra(this);
    public final AnonymousClass2L6 A0Y = AnonymousClass2L6.A00();
    public final AnonymousClass00Y A0Z = AnonymousClass00Y.A00();
    public final AnonymousClass0EO A0a = AnonymousClass0EO.A00();
    public final C04420Kh A0b = C04420Kh.A00();
    public final AnonymousClass0CH A0c = AnonymousClass0CH.A00();
    public final AnonymousClass022 A0d = AnonymousClass022.A00();
    public final AbstractC658531u A0e = AbstractC658531u.A00();
    public final AnonymousClass31y A0f = AnonymousClass31y.A00();
    public final AnonymousClass320 A0g = AnonymousClass320.A00();
    public final AnonymousClass322 A0h = AnonymousClass322.A00();
    public final AnonymousClass325 A0i = AnonymousClass325.A00();
    public final AnonymousClass00T A0j = C002101e.A00();
    public final Runnable A0k = new RunnableEBaseShape13S0100000_I1_8(this, 10);
    public final Runnable A0l = new RunnableEBaseShape13S0100000_I1_8(this, 9);

    @Override // X.AbstractC43421yL
    public void A1w(C007303n r1) {
    }

    @Override // X.AbstractC43421yL
    public void A3i(C007303n r1) {
    }

    @Override // X.AbstractC43421yL
    public void A4T(AbstractC007503q r1) {
    }

    @Override // X.AbstractC43421yL
    public AnonymousClass1KQ A4l() {
        return null;
    }

    @Override // X.AbstractC43421yL
    public int A5Q() {
        return 0;
    }

    @Override // X.AbstractC43421yL
    public int A5t(AnonymousClass0MO r2) {
        return 0;
    }

    @Override // X.AbstractC43421yL
    public ArrayList A8u() {
        return null;
    }

    @Override // X.AbstractC03640Hb
    public AnonymousClass0D1 A9D() {
        return null;
    }

    @Override // X.AbstractC43421yL
    public int A9L(AbstractC007503q r2) {
        return 0;
    }

    @Override // X.AbstractC43421yL
    public boolean ABf(AbstractC007503q r2) {
        return false;
    }

    @Override // X.AbstractC43421yL
    public void ANT(AbstractC007503q r1) {
    }

    @Override // X.AbstractC43421yL
    public void APB(AbstractC007503q r1, int i) {
    }

    @Override // X.AbstractC43421yL
    public boolean APY(C007303n r2) {
        return true;
    }

    @Override // X.AbstractC43421yL
    public void AQt(AnonymousClass0MO r1, long j) {
    }

    @Override // X.AbstractC43421yL
    public void AQw(AbstractC007503q r1) {
    }

    @Override // X.AbstractC43421yL
    public void animateStar(View view) {
    }

    public static Intent A04(Context context, int i, AnonymousClass02N r5, long j, String str, int i2) {
        Intent intent = new Intent(context, StorageUsageGalleryActivity.class);
        intent.putExtra("gallery_type", i);
        String str2 = null;
        if (i == 0) {
            if (r5 != null) {
                str2 = r5.getRawString();
            } else {
                throw null;
            }
        }
        intent.putExtra("jid", str2);
        intent.putExtra("memory_size", j);
        intent.putExtra("session_id", str);
        intent.putExtra("entry_point", i2);
        return intent;
    }

    public final void A0T() {
        Handler handler = this.A0I;
        handler.removeCallbacks(this.A0l);
        Runnable runnable = this.A0G;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.A0G = null;
        }
        ProgressDialogFragment progressDialogFragment = this.A0C;
        if (progressDialogFragment != null) {
            progressDialogFragment.A0r();
            this.A0C = null;
        }
        C10700f3 r0 = this.A0A;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A0A = null;
        }
        C04080Iy r02 = this.A07;
        if (r02 != null) {
            r02.A01();
            this.A07 = null;
        }
    }

    public final void A0U() {
        TextView textView = (TextView) AnonymousClass0Q7.A0D(this.A04, R.id.storage_usage_detail_all_size);
        long j = this.A03;
        if (j >= 0) {
            textView.setText(C002001d.A1b(((AnonymousClass2C0) this).A01, Math.max(j - this.A02, 0L)));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public final void A0V() {
        C47612Is r8;
        AbstractC06110Rt r1 = this.A06;
        if (r1 != null && (r8 = this.A09) != null) {
            if (r8.isEmpty()) {
                r1.A00();
                return;
            }
            C002001d.A2R(this, super.A0I, ((AnonymousClass2C0) this).A01.A0A(R.plurals.n_items_selected, (long) r8.size(), Integer.valueOf(r8.size())));
            this.A06.A01();
        }
    }

    @Override // X.AbstractC43421yL
    public C51822a5 A5U() {
        return this.A0Q.A01;
    }

    @Override // X.AbstractC43421yL
    public boolean AAO() {
        return this.A09 != null;
    }

    @Override // X.AbstractC43421yL
    public boolean ABK(AbstractC007503q r3) {
        C47612Is r1 = this.A09;
        return r1 != null && r1.containsKey(r3.A0n);
    }

    @Override // X.AbstractC43421yL
    public void AP3(List list, boolean z) {
        if (this.A09 == null) {
            this.A09 = new C47612Is(((ActivityC004702f) this).A0F, this.A0V, null, new AnonymousClass3RQ(this));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC007503q r2 = (AbstractC007503q) it.next();
            C47612Is r1 = this.A09;
            if (z) {
                r1.put(r2.A0n, r2);
            } else {
                r1.remove(r2.A0n);
            }
        }
        A0V();
    }

    @Override // X.AbstractC43421yL
    public void AQ6(AbstractC007503q r9) {
        C47612Is r1 = new C47612Is(((ActivityC004702f) this).A0F, this.A0V, this.A09, new AnonymousClass3RQ(this));
        this.A09 = r1;
        r1.put(r9.A0n, r9);
        this.A06 = A0B(this.A05);
        AnonymousClass03P r7 = super.A0I;
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        C47612Is r12 = this.A09;
        C002001d.A2R(this, r7, r6.A0A(R.plurals.n_items_selected, (long) r12.size(), Integer.valueOf(r12.size())));
    }

    @Override // X.AbstractC43421yL
    public boolean AQh(AbstractC007503q r6) {
        C47612Is r4 = this.A09;
        if (r4 == null) {
            r4 = new C47612Is(((ActivityC004702f) this).A0F, this.A0V, null, new AnonymousClass3RQ(this));
            this.A09 = r4;
        }
        C007303n r2 = r6.A0n;
        boolean containsKey = r4.containsKey(r2);
        C47612Is r0 = this.A09;
        if (containsKey) {
            r0.remove(r2);
            A0V();
        } else {
            r0.put(r2, r6);
            A0V();
        }
        return !containsKey;
    }

    public /* synthetic */ void lambda$initToolbar$2623$StorageUsageGalleryActivity(View view) {
        onBackPressed();
    }

    public void lambda$initToolbar$2625$StorageUsageGalleryActivity(View view) {
        StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = this.A0E;
        if (storageUsageMediaGalleryFragment != null) {
            int i = ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A02;
            boolean z = true;
            if (!((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A0r) || this.A01 != 1) {
                z = false;
            }
            StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = new StorageUsageGallerySortBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", i);
            bundle.putBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", z);
            storageUsageGallerySortBottomSheet.A0N(bundle);
            storageUsageGallerySortBottomSheet.A00 = new AnonymousClass3RO(this);
            APm(storageUsageGallerySortBottomSheet);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        long j = this.A02;
        if (j >= 0) {
            if (j > this.A03) {
                Log.e("Deleted media size is greater than the total media size");
            }
            Intent intent = new Intent();
            AnonymousClass02N r0 = this.A0D;
            if (r0 != null) {
                intent.putExtra("jid", AnonymousClass1VY.A0D(r0));
            }
            intent.putExtra("gallery_type", this.A01);
            intent.putExtra("memory_size", Math.max(this.A03 - this.A02, 0L));
            intent.putExtra("deleted_size", this.A02);
            setResult(1, intent);
        }
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A0F();
        setContentView(R.layout.activity_storage_usage_gallery);
        AnonymousClass02M r2 = ((ActivityC004702f) this).A0F;
        AnonymousClass0Z6 r0 = this.A0K;
        AnonymousClass320 r02 = this.A0g;
        AnonymousClass01I r03 = this.A0J;
        AnonymousClass00T r04 = this.A0j;
        AnonymousClass325 r05 = this.A0i;
        AnonymousClass00Y r06 = this.A0Z;
        C000300f r07 = ((ActivityC004702f) this).A0G;
        AnonymousClass0DH r08 = this.A0M;
        C04360Kb r09 = this.A0L;
        AbstractC658531u r010 = this.A0e;
        C02780Dk r011 = ((ActivityC004602e) this).A04;
        AnonymousClass01A r5 = this.A0N;
        AnonymousClass03P r15 = super.A0I;
        C014308b r11 = this.A0O;
        AnonymousClass01X r10 = ((AnonymousClass2C0) this).A01;
        this.A05 = new C74243aQ(this, this, r2, r0, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011, r5, r15, r11, r10, this.A0a, this.A0f, this.A0h, this.A0W, this.A0c, this.A0b, this.A0S, this.A0d);
        this.A08 = this.A0P.A03(this);
        int intExtra = getIntent().getIntExtra("gallery_type", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
            if (A012 != null) {
                this.A0D = A012;
                this.A0B = r5.A09(A012);
            } else {
                throw null;
            }
        }
        this.A03 = getIntent().getLongExtra("memory_size", 0);
        this.A0H = getIntent().getStringExtra("session_id");
        this.A00 = getIntent().getIntExtra("entry_point", 0);
        if (bundle == null) {
            int i = this.A01;
            AnonymousClass02N r012 = this.A0D;
            String rawString = r012 != null ? r012.getRawString() : null;
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = new StorageUsageMediaGalleryFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("storage_media_gallery_fragment_gallery_type", i);
            bundle2.putString("storage_media_gallery_fragment_jid", rawString);
            bundle2.putInt("sort_type", 2);
            storageUsageMediaGalleryFragment.A0N(bundle2);
            this.A0E = storageUsageMediaGalleryFragment;
            AnonymousClass0LW A042 = A04();
            if (A042 != null) {
                AnonymousClass0QB r13 = new AnonymousClass0QB(A042);
                r13.A0A(R.id.storage_usage_gallery_container, this.A0E, "storage_usage_gallery_fragment_tag", 1);
                r13.A00();
                this.A02 = 0;
            } else {
                throw null;
            }
        } else {
            this.A0E = (StorageUsageMediaGalleryFragment) A04().A0Q.A01("storage_usage_gallery_fragment_tag");
            List<C007303n> A0N2 = C006803i.A0N(bundle);
            if (A0N2 != null) {
                for (C007303n r132 : A0N2) {
                    AbstractC007503q A052 = this.A0R.A0J.A05(r132);
                    if (A052 != null) {
                        C47612Is r6 = this.A09;
                        if (r6 == null) {
                            r6 = new C47612Is(r2, this.A0V, null, new AnonymousClass3RQ(this));
                            this.A09 = r6;
                        }
                        r6.put(r132, A052);
                    }
                }
                if (this.A09 != null) {
                    this.A06 = A0B(this.A05);
                }
            }
            this.A02 = bundle.getLong("deleted_size");
        }
        this.A0Y.A07.add(this.A0X);
        this.A0V.A01(this.A0U);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(false);
            A092.A0D(false);
            View findViewById = findViewById(R.id.toolbar);
            if (findViewById != null) {
                ((Toolbar) findViewById).A09();
                View inflate = LayoutInflater.from(this).inflate(R.layout.storage_usage_detail_toolbar, (ViewGroup) null, false);
                if (inflate != null) {
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    this.A04 = viewGroup;
                    ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(viewGroup, R.id.storage_usage_back_button);
                    imageView.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 0));
                    if (r10.A0M()) {
                        imageView.setImageResource(R.drawable.ic_back);
                    } else {
                        imageView.setImageResource(R.drawable.ic_back_rtl);
                    }
                    View A0D2 = AnonymousClass0Q7.A0D(this.A04, R.id.storage_usage_sort_button);
                    A0D2.setVisibility(0);
                    A0D2.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 1));
                    A092.A0B(true);
                    A092.A06(this.A04, new AnonymousClass0S5(-1, -1));
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass0Q7.A0D(this.A04, R.id.storage_usage_detail_name);
                    View A0D3 = AnonymousClass0Q7.A0D(this.A04, R.id.storage_usage_contact_photo_container);
                    ImageView imageView2 = (ImageView) AnonymousClass0Q7.A0D(this.A04, R.id.storage_usage_contact_photo);
                    int i2 = this.A01;
                    if (i2 == 2) {
                        textEmojiLabel.setText(C28051Sr.A0p(this, r10));
                        A0D3.setVisibility(8);
                    } else if (i2 == 1) {
                        textEmojiLabel.setText(r10.A06(R.string.storage_usage_forwarded_files_title));
                        A0D3.setVisibility(8);
                    } else if (i2 == 0) {
                        C007003k r013 = this.A0B;
                        if (r013 != null) {
                            textEmojiLabel.A02(r11.A08(r013, false));
                            A0D3.setVisibility(0);
                            this.A08.A02(this.A0B, imageView2);
                        } else {
                            throw null;
                        }
                    }
                    textEmojiLabel.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    textEmojiLabel.setMarqueeRepeatLimit(1);
                    textEmojiLabel.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(textEmojiLabel, 49));
                    r2.A02.postDelayed(new RunnableEBaseShape9S0200000_I1_4(this, textEmojiLabel, 26), 1000);
                    A0U();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C47612Is r0 = this.A09;
        if (r0 != null) {
            r0.A00();
            this.A09 = null;
        }
        this.A0E = null;
        AnonymousClass2L6 r02 = this.A0Y;
        r02.A07.remove(this.A0X);
        this.A0I.removeCallbacks(null);
        A0T();
        this.A0V.A00(this.A0U);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C47612Is r0 = this.A09;
        if (r0 != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC007503q r02 : r0.values()) {
                arrayList.add(r02.A0n);
            }
            C006803i.A0U(bundle, arrayList);
        }
        bundle.putLong("deleted_size", this.A02);
    }
}
