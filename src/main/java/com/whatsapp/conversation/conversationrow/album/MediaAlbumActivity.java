package com.whatsapp.conversation.conversationrow.album;

import X.AbstractC007503q;
import X.AbstractC15630oP;
import X.AbstractC15640oQ;
import X.AbstractC43421yL;
import X.AbstractC658531u;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass08B;
import X.AnonymousClass0AC;
import X.AnonymousClass0BP;
import X.AnonymousClass0EO;
import X.AnonymousClass0OY;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass0Z6;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2DW;
import X.AnonymousClass2IY;
import X.AnonymousClass2IZ;
import X.AnonymousClass2Ib;
import X.AnonymousClass2UT;
import X.AnonymousClass2a9;
import X.AnonymousClass320;
import X.AnonymousClass322;
import X.AnonymousClass325;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C014308b;
import X.C04350Ka;
import X.C05390Oi;
import X.C14270lr;
import X.C14360m9;
import X.C15650oR;
import X.C47482Ia;
import X.C47492Ic;
import X.C51832a6;
import X.C51842a7;
import X.C51852a8;
import X.C51862aA;
import X.C59292nP;
import android.animation.TimeInterpolator;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MediaAlbumActivity extends AnonymousClass2DW implements AbstractC43421yL, AbstractC15630oP {
    public Bundle A00;
    public C47482Ia A01;
    public AnonymousClass2Ib A02;
    public final AnonymousClass0Z6 A03 = AnonymousClass0Z6.A00();
    public final C04350Ka A04 = C04350Ka.A00();
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass0BP A06 = new C51852a8(this);
    public final AnonymousClass08B A07 = AnonymousClass08B.A00;
    public final C014308b A08 = C014308b.A00();
    public final AnonymousClass03P A09 = AnonymousClass03P.A00();
    public final AnonymousClass01T A0A = AnonymousClass01T.A00();
    public final AnonymousClass019 A0B = new C51842a7(this);
    public final AnonymousClass0AC A0C = AnonymousClass0AC.A00;
    public final AnonymousClass00Y A0D = AnonymousClass00Y.A00();
    public final AnonymousClass0EO A0E = AnonymousClass0EO.A00();
    public final AnonymousClass022 A0F = AnonymousClass022.A00();
    public final AbstractC658531u A0G = AbstractC658531u.A00();
    public final AnonymousClass320 A0H = AnonymousClass320.A00();
    public final AnonymousClass322 A0I = AnonymousClass322.A00();
    public final AnonymousClass325 A0J = AnonymousClass325.A00();
    public final AnonymousClass00T A0K = C002101e.A00();
    public final HashSet A0L = new HashSet();
    public final HashSet A0M = new HashSet();

    @Override // X.AbstractC43421yL
    public int A5Q() {
        return 2;
    }

    @Override // X.AbstractC43421yL
    public ArrayList A8u() {
        return null;
    }

    @Override // X.AbstractC43421yL
    public boolean ABf(AbstractC007503q r2) {
        return false;
    }

    @Override // X.AbstractC15630oP
    public void AHG(C15650oR r1) {
    }

    public final void A0Z() {
        AnonymousClass01X r5;
        String A0D2;
        List list = this.A02.A00;
        if (!(list == null || list.isEmpty())) {
            int i = 0;
            int i2 = 0;
            for (AbstractC007503q r0 : this.A02.A00) {
                byte b = r0.A0m;
                if (b == 1) {
                    i2++;
                } else if (b == 3) {
                    i++;
                }
            }
            AbstractC007503q r6 = (AbstractC007503q) this.A02.A00.get(0);
            if (i == 0) {
                r5 = ((AnonymousClass2C0) this).A01;
                A0D2 = r5.A0A(R.plurals.number_of_photos, (long) i2, Integer.valueOf(i2));
            } else if (i2 == 0) {
                r5 = ((AnonymousClass2C0) this).A01;
                A0D2 = r5.A0A(R.plurals.number_of_videos, (long) i, Integer.valueOf(i));
            } else {
                r5 = ((AnonymousClass2C0) this).A01;
                A0D2 = r5.A0D(R.string.number_of_photos_and_videos, r5.A0A(R.plurals.number_of_photos, (long) i2, Integer.valueOf(i2)), r5.A0A(R.plurals.number_of_videos, (long) i, Integer.valueOf(i)));
            }
            if (AnonymousClass0OY.A00(System.currentTimeMillis(), r6.A0E) != 0) {
                StringBuilder A0Y = AnonymousClass008.A0Y(A0D2, "  ");
                AnonymousClass008.A0o(r5, R.string.contacts_help_bullet, A0Y, "  ");
                A0Y.append(C002001d.A1c(r5, r6.A0E));
                A0D2 = A0Y.toString();
            }
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A07(A0D2);
                return;
            }
            throw null;
        }
    }

    public final void A0a(AbstractC007503q r4) {
        AnonymousClass00E.A09(!(r4 instanceof C05390Oi), "should not reply to systemMessage");
        AnonymousClass02N A072 = r4.A07();
        if (A072 != null) {
            Conversation.A4m.put(A072, r4);
            Intent intent = new Intent(this, Conversation.class);
            intent.putExtra("jid", A072.getRawString());
            startActivity(intent);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC15630oP
    public C15650oR AEk(int i, Bundle bundle) {
        return new C59292nP(this, getIntent().getLongArrayExtra("message_ids"));
    }

    @Override // X.AbstractC15630oP
    public /* bridge */ /* synthetic */ void AHA(C15650oR r12, Object obj) {
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            AnonymousClass2Ib r9 = this.A02;
            r9.A00 = list;
            r9.notifyDataSetChanged();
            MediaAlbumActivity mediaAlbumActivity = r9.A02;
            if (mediaAlbumActivity.A00 != null) {
                mediaAlbumActivity.A0T().setSelectionFromTop(mediaAlbumActivity.A00.getInt("top_index"), mediaAlbumActivity.A00.getInt("top_offset"));
                mediaAlbumActivity.A00 = null;
            } else {
                int i = 0;
                boolean z = false;
                int intExtra = mediaAlbumActivity.getIntent().getIntExtra("start_index", 0);
                if (intExtra < r9.getCount()) {
                    C47492Ic r4 = r9.A01;
                    if (r4 != null) {
                        Point point = new Point();
                        MediaAlbumActivity mediaAlbumActivity2 = r4.A05;
                        mediaAlbumActivity2.getWindowManager().getDefaultDisplay().getSize(point);
                        int i2 = point.y;
                        int i3 = point.x;
                        ListView A0T = mediaAlbumActivity2.A0T();
                        if (i2 >= i3) {
                            View view = r9.getView(intExtra, null, A0T);
                            view.measure(View.MeasureSpec.makeMeasureSpec(i3, EditorInfoCompat.IME_FLAG_FORCE_ASCII), 0);
                            r4.A01 = (i2 << 2) / 5;
                            int measuredHeight = view.getMeasuredHeight();
                            r4.A02 = measuredHeight;
                            int i4 = r4.A01;
                            if (i4 < measuredHeight) {
                                r4.A00 = intExtra;
                            } else {
                                r4.A00 = -1;
                            }
                            if (intExtra != 0) {
                                int min = Math.min(measuredHeight, i4);
                                if (intExtra == r9.getCount() - 1) {
                                    z = true;
                                }
                                r4.A03 = r4.A00(i2, min, z);
                                A0T.setSelectionFromTop(A0T.getHeaderViewsCount() + intExtra, r4.A03);
                            } else {
                                r4.A03 = 0;
                            }
                        } else {
                            int headerViewsCount = A0T.getHeaderViewsCount() + intExtra;
                            if (Build.VERSION.SDK_INT >= 21) {
                                int identifier = mediaAlbumActivity2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                                if (identifier > 0) {
                                    i = mediaAlbumActivity2.getResources().getDimensionPixelSize(identifier);
                                } else {
                                    i = 0;
                                }
                            }
                            A0T.setSelectionFromTop(headerViewsCount, mediaAlbumActivity2.getResources().getDimensionPixelSize(R.dimen.actionbar_height) + i);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            A0Z();
            A0T().getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2IZ(this));
            return;
        }
        finish();
    }

    public void finishAfterTransition() {
        if (getIntent().hasExtra("start_index")) {
            AnonymousClass0TX.A0F(this, new C51862aA(this));
        }
        super.finishAfterTransition();
    }

    @Override // X.AnonymousClass2DW, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            Collection A0V = A0V();
            if (!((AbstractCollection) A0V).isEmpty()) {
                List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
                ArrayList arrayList = new ArrayList(A0V);
                Collections.sort(arrayList, C14360m9.A00);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass2DW) this).A0C.A09(this.A04, (AbstractC007503q) it.next(), A0G2);
                }
                AbstractList abstractList = (AbstractList) A0G2;
                if (abstractList.size() != 1 || AnonymousClass1VY.A0b((Jid) abstractList.get(0))) {
                    A0S(A0G2);
                } else {
                    startActivity(Conversation.A04(this, ((AnonymousClass2DW) this).A0F.A0A((AnonymousClass02N) abstractList.get(0))));
                }
            } else {
                Log.w("mediaalbum/forward/failed");
                ((ActivityC004702f) this).A0F.A06(R.string.message_forward_failed, 0);
            }
            A0W();
        }
    }

    @Override // X.AnonymousClass2DW, X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int length;
        if (AnonymousClass2UT.A00) {
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(220L);
            autoTransition.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        this.A00 = bundle;
        super.onCreate(bundle);
        AnonymousClass0TX.A0C(this);
        setContentView(R.layout.media_album);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            this.A07.A01(this.A06);
            this.A0C.A01(this.A0B);
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().getDecorView().setSystemUiVisibility(1792);
                getWindow().addFlags(134217728);
                getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                getWindow().setStatusBarColor(C004302a.A00(this, R.color.primary_dark));
            }
            AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
            if (A012 == null) {
                A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.you));
            } else {
                A092.A08(this.A08.A08(((AnonymousClass2DW) this).A0F.A0A(A012), false));
            }
            this.A02 = new AnonymousClass2Ib(this);
            ListView A0T = A0T();
            A0T.setFastScrollEnabled(false);
            A0T.setScrollbarFadingEnabled(true);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.actionbar_height));
            A0T.addHeaderView(frameLayout, null, false);
            FrameLayout frameLayout2 = new FrameLayout(this);
            A0T.addFooterView(frameLayout2, null, false);
            View findViewById = findViewById(R.id.title_background);
            AnonymousClass0Q7.A0e(A0T, new C51832a6(this, frameLayout, frameLayout2, findViewById));
            C47482Ia r0 = new C47482Ia(C004302a.A00(this, R.color.primary));
            this.A01 = r0;
            A092.A03(r0);
            A0T.setOnScrollListener(new AnonymousClass2IY(this, A0T, frameLayout, C004302a.A00(this, R.color.media_view_footer_background), C004302a.A00(this, R.color.primary_dark), C004302a.A00(this, R.color.primary)));
            A0U(this.A02);
            if (Build.VERSION.SDK_INT >= 21) {
                View findViewById2 = findViewById(R.id.background);
                VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(this);
                verticalSwipeDismissBehavior.A06 = new AnonymousClass2a9(this, findViewById2, findViewById, toolbar);
                ((C14270lr) A0T.getLayoutParams()).A00(verticalSwipeDismissBehavior);
            }
            long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
            if (longArrayExtra == null || (length = longArrayExtra.length) == 0) {
                finish();
                return;
            }
            A092.A07(((AnonymousClass2C0) this).A01.A0A(R.plurals.notification_new_message_from_multiple_contacts_1, (long) length, Integer.valueOf(length)));
            AbstractC15640oQ.A00(this).A01(0, null, this);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2DW, X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00(this.A06);
        this.A0C.A00(this.A0B);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        AnonymousClass0TX.A0B(this);
        return true;
    }

    @Override // X.AnonymousClass2DW, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ListView A0T = A0T();
        bundle.putInt("top_index", A0T.getFirstVisiblePosition());
        int i = 0;
        View childAt = A0T.getChildAt(0);
        if (childAt != null) {
            i = childAt.getTop() - A0T.getPaddingTop();
        }
        bundle.putInt("top_offset", i);
    }
}
