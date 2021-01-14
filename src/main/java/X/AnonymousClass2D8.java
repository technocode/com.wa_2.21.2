package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.Slide;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.biz.catalog.EllipsizedTextEmojiLabel;
import com.whatsapp.biz.catalog.ShareProductLinkActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2D8  reason: invalid class name */
public abstract class AnonymousClass2D8 extends ActivityC004602e implements AnonymousClass1S1 {
    public int A00 = 0;
    public int A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextEmojiLabel A05;
    public WaTextView A06;
    public CatalogCarouselDetailImageView A07;
    public AnonymousClass1S0 A08;
    public CatalogMediaCard A09;
    public EllipsizedTextEmojiLabel A0A;
    public C48052Ks A0B;
    public UserJid A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public final C04360Kb A0G = C04360Kb.A00();
    public final C27831Rq A0H = C27831Rq.A00();
    public final AnonymousClass0HL A0I = AnonymousClass0HL.A00();
    public final C27881Ry A0J = C27881Ry.A00();
    public final AnonymousClass1S3 A0K = AnonymousClass1S3.A00();
    public final AnonymousClass1S6 A0L = AnonymousClass1S6.A00();
    public final C07430Xq A0M = C07430Xq.A00;
    public final AnonymousClass01A A0N = AnonymousClass01A.A00();
    public final AnonymousClass0AI A0O = AnonymousClass0AI.A00();
    public final AnonymousClass04j A0P = AnonymousClass04j.A00();
    public final AnonymousClass00T A0Q = C002101e.A00();

    public static void A04(UserJid userJid, String str, boolean z, Integer num, Integer num2, Context context, Intent intent, int i) {
        Bundle A012;
        Context A0O2 = C002001d.A0O(context);
        if (A0O2 instanceof ActivityC004802g) {
            Activity activity = (Activity) A0O2;
            intent.putExtra("product", str);
            intent.putExtra("disable_report", z);
            intent.putExtra("jid", userJid.getRawString());
            if (num2 != null) {
                intent.putExtra("thumb_height", num2);
            }
            if (num != null) {
                intent.putExtra("thumb_width", num);
            }
            intent.putExtra("view_product_origin", i);
            if (!C27841Rr.A00) {
                A012 = null;
            } else {
                A012 = C14460mJ.A00(activity, new AnonymousClass02R[0]).A01();
            }
            activity.startActivityForResult(intent, 0, A012);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a2, code lost:
        if (r2.A00() == false) goto L_0x01ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T() {
        /*
        // Method dump skipped, instructions count: 468
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2D8.A0T():void");
    }

    public boolean A0U() {
        C48052Ks r3 = this.A0B;
        if (r3 == null) {
            return false;
        }
        boolean z = false;
        if (r3 != null && r3.A00 && this.A00 == 0 && !r3.A00()) {
            z = true;
        }
        if (!z) {
            return false;
        }
        boolean z2 = false;
        if (r3.A02.A00 == 0) {
            z2 = true;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r10 == 404) goto L_0x003f;
     */
    @Override // X.AnonymousClass1S1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AFw(java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2D8.AFw(java.lang.String, int):void");
    }

    @Override // X.AnonymousClass1S1
    public void AFx(C48092Kw r8, String str) {
        if (this.A00 == 1) {
            this.A0H.A02(12, 31, null, this.A0C);
        }
        this.A00 = 0;
        C07430Xq r0 = this.A0M;
        if (r0 != null) {
            AnonymousClass00E.A01();
            Iterator it = r0.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass1S8 r12 = (AnonymousClass1S8) r1.next();
                    if (r12 instanceof C42771xG) {
                        ProductDetailActivity productDetailActivity = ((C42771xG) r12).A00;
                        AnonymousClass0HL r4 = ((AnonymousClass2D8) productDetailActivity).A0I;
                        C48052Ks A022 = r4.A02(str);
                        C48052Ks r2 = ((AnonymousClass2D8) productDetailActivity).A0B;
                        if (r2 == null || (r2.A06.equals(str) && !r2.equals(A022))) {
                            ((AnonymousClass2D8) productDetailActivity).A00 = 0;
                            ((AnonymousClass2D8) productDetailActivity).A0B = r4.A02(str);
                            productDetailActivity.A0T();
                        }
                    } else if (r12 instanceof C42461wk) {
                        ((C42461wk) r12).A00.A01.A0B(str);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        C48052Ks r1;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && (r1 = this.A0B) != null) {
            if (i == 3) {
                List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
                this.A0G.A0A(this.A0B, A0G2, this.A0C, Uri.fromFile(new File(intent.getStringExtra("file_path"))), null);
                AbstractList abstractList = (AbstractList) A0G2;
                if (abstractList.size() == 1) {
                    startActivity(Conversation.A04(this, this.A0N.A0A((AnonymousClass02N) abstractList.get(0))));
                } else {
                    A0S(A0G2);
                }
            } else if (i == 66) {
                this.A0L.A05(this, this.A08, this.A0C, 3, Collections.singletonList(r1), null, 0, 0);
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        C48052Ks r0;
        this.A01 = getIntent().getIntExtra("view_product_origin", 0);
        if (C27841Rr.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            Slide slide = new Slide(5);
            slide.excludeTarget(16908335, true);
            slide.excludeTarget(16908336, true);
            slide.setInterpolator(new DecelerateInterpolator());
            window.setEnterTransition(slide);
            window.setReturnTransition(slide);
        }
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            this.A0C = nullable;
            String stringExtra = getIntent().getStringExtra("product");
            if (stringExtra != null) {
                this.A0D = stringExtra;
                this.A0E = getIntent().getBooleanExtra("disable_report", false);
                setContentView(R.layout.business_product_catalog_detail);
                this.A07 = (CatalogCarouselDetailImageView) findViewById(R.id.catalog_carousel_detail_image_view);
                this.A05 = (TextEmojiLabel) findViewById(R.id.catalog_detail_title);
                this.A03 = (TextView) findViewById(R.id.catalog_detail_price);
                this.A0A = (EllipsizedTextEmojiLabel) findViewById(R.id.catalog_detail_description);
                this.A02 = (TextView) findViewById(R.id.catalog_detail_link);
                this.A04 = (TextView) findViewById(R.id.catalog_detail_sku);
                this.A06 = (WaTextView) findViewById(R.id.loading_product_text);
                this.A09 = (CatalogMediaCard) findViewById(R.id.product_message_catalog_media_card);
                View findViewById = findViewById(R.id.product_detail_image_toolbar);
                if (findViewById != null) {
                    Toolbar toolbar = (Toolbar) findViewById;
                    toolbar.setTitle("");
                    toolbar.A09();
                    A0C(toolbar);
                    AnonymousClass0S2 A092 = A09();
                    if (A092 != null) {
                        A092.A0A(true);
                    }
                    toolbar.setNavigationIcon(new C06470Tj(((AnonymousClass2C0) this).A01, C004302a.A03(this, R.drawable.ic_back_shadow)));
                    this.A0B = this.A0I.A02(this.A0D);
                    AnonymousClass1S0 r02 = this.A08;
                    if (r02 != null) {
                        r02.A00();
                    }
                    this.A08 = new AnonymousClass1S0(this.A0J);
                    if (bundle == null && (r0 = this.A0B) != null) {
                        this.A0H.A02(12, 31, r0.A06, this.A0C);
                    }
                    this.A0K.A08.add(this);
                    if (((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A0s) && this.A01 == 6) {
                        this.A0Q.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 36));
                        return;
                    }
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
        CatalogMediaCard catalogMediaCard = this.A09;
        if (catalogMediaCard != null) {
            catalogMediaCard.A01.A00();
            catalogMediaCard.A0H.A00(catalogMediaCard.A0G);
        }
        this.A0K.A08.remove(this);
        AnonymousClass1S0 r0 = this.A08;
        if (r0 != null) {
            r0.A00();
        }
        super.onDestroy();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            ShareProductLinkActivity.A04(this, this.A0C, this.A0D);
            return true;
        } else if (itemId == 2) {
            if (A0U()) {
                this.A0L.A05(this, this.A08, this.A0C, 3, Collections.singletonList(this.A0B), null, 0, 0);
            }
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        A0T();
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A0K.A05(new C48092Kw(this.A0C, this.A0D, Integer.valueOf(getIntent().getIntExtra("thumb_width", (int) getResources().getDimension(R.dimen.medium_thumbnail_size))), Integer.valueOf(getIntent().getIntExtra("thumb_height", (int) getResources().getDimension(R.dimen.medium_thumbnail_size))), this.A0H.A00));
        if (this.A0B == null) {
            this.A00 = 1;
        }
    }
}
