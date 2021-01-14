package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3RI  reason: invalid class name */
public abstract class AnonymousClass3RI implements AbstractC63942xG {
    public int A00;
    public int A01;
    public int A02;
    public GridLayoutManager A03;
    public RecyclerView A04;
    public AnonymousClass3QG A05;
    public AnonymousClass3RH A06 = new AnonymousClass3RH(this);
    public boolean A07 = false;
    public final int A08;
    public final Context A09;
    public final LayoutInflater A0A;
    public final C002701k A0B;

    public void A03(View view) {
    }

    public AnonymousClass3RI(C002701k r3, Context context, LayoutInflater layoutInflater, int i) {
        this.A0B = r3;
        this.A09 = context;
        this.A0A = layoutInflater;
        this.A08 = i;
        int i2 = C008805h.A09(context).x / i;
        if (this.A00 != i2) {
            this.A00 = i2;
            GridLayoutManager gridLayoutManager = this.A03;
            if (gridLayoutManager != null) {
                gridLayoutManager.A1N(i2);
            }
            AnonymousClass3QG r0 = this.A05;
            if (r0 != null) {
                ((AbstractC16300pa) r0).A01.A00();
            }
        }
    }

    public AnonymousClass3QG A00() {
        AnonymousClass3QG r2 = this.A05;
        if (r2 == null) {
            if (this instanceof C74223aN) {
                C74223aN r0 = (C74223aN) this;
                r2 = new AnonymousClass3QG(r0.A04.A04, r0.A09, r0.A06, r0.A05, r0.A08, 6);
                r2.A02 = new AnonymousClass3RE(r0);
            } else if (this instanceof C74213aM) {
                C74213aM r02 = (C74213aM) this;
                r02.A01();
                r2 = new AnonymousClass3QG(null, r02.A09, r02.A03, r02.A02, r02.A05, 4);
                r2.A02 = new AnonymousClass3RC(r02);
            } else if (this instanceof C74203aL) {
                C74203aL r03 = (C74203aL) this;
                if (r03.A03 == null) {
                    AnonymousClass3QG r22 = new AnonymousClass3QG(null, ((AnonymousClass3RI) r03).A09, r03.A08, r03.A06, r03.A09, 3);
                    r03.A03 = r22;
                    r22.A02 = new AnonymousClass3RB(r03);
                    C04230Jo r5 = r03.A07;
                    r5.A0A.execute(new RunnableEBaseShape9S0200000_I1_4(r5, new AnonymousClass3RF(r03), 12));
                }
                r2 = r03.A03;
            } else if (!(this instanceof C74193aK)) {
                C74183aJ r04 = (C74183aJ) this;
                r2 = new AnonymousClass3QG((List) r04.A03.A01.A01(), r04.A09, r04.A01, r04.A00, r04.A02, 7);
            } else {
                C74193aK r05 = (C74193aK) this;
                r2 = new AnonymousClass3QG(r05.A01, r05.A09, r05.A04, r05.A03, r05.A05, 5);
                r2.A02 = new AnonymousClass3RA(r05);
            }
            this.A05 = r2;
            boolean z = this.A07;
            r2.A04 = z;
            int i = 1;
            if (z) {
                i = 2;
            }
            r2.A00 = i;
        }
        return r2;
    }

    public void A01() {
        int size;
        if (this instanceof C74223aN) {
            C74223aN r1 = (C74223aN) this;
            ((AbstractC16300pa) r1.A00()).A01.A00();
            r1.A05();
        } else if (this instanceof C74213aM) {
            C74213aM r0 = (C74213aM) this;
            C03570Gt r3 = r0.A04;
            AnonymousClass3RD r12 = new AnonymousClass3RD(r0);
            if (r3 != null) {
                Log.d("StickerRepository/getStarredStickersAsync/begin");
                r3.A0R.ANC(new C09780dW(r3, r12), new Void[0]);
                return;
            }
            throw null;
        } else if (this instanceof C74203aL) {
            C74203aL r02 = (C74203aL) this;
            C04230Jo r4 = r02.A07;
            r4.A0A.execute(new RunnableEBaseShape9S0200000_I1_4(r4, new AnonymousClass3RF(r02), 12));
        } else if (this instanceof C74193aK) {
            C74193aK r32 = (C74193aK) this;
            ((AbstractC16300pa) r32.A00()).A01.A00();
            if (r32.A00 != null) {
                List list = r32.A01;
                int i = 0;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                View view = r32.A00;
                if (size != 0) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    public void A02(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int dimensionPixelSize = i2 - this.A09.getResources().getDimensionPixelSize(R.dimen.picker_footer_height);
            if (dimensionPixelSize != this.A01) {
                this.A01 = dimensionPixelSize;
                int i3 = this.A08;
                int i4 = (i3 * 3) >> 2;
                int i5 = dimensionPixelSize % i3;
                if (i5 >= (i3 >> 2) && i5 <= i4) {
                    i4 = i5;
                }
                int max = Math.max(0, dimensionPixelSize - i4);
                this.A02 = (max % i3) / ((max / i3) + 1);
            }
            int i6 = i / this.A08;
            if (this.A00 != i6) {
                this.A00 = i6;
                GridLayoutManager gridLayoutManager = this.A03;
                if (gridLayoutManager != null) {
                    gridLayoutManager.A1N(i6);
                }
                AnonymousClass3QG r0 = this.A05;
                if (r0 != null) {
                    ((AbstractC16300pa) r0).A01.A00();
                }
            }
        }
    }

    public void A04(boolean z) {
        this.A07 = z;
        AnonymousClass3QG r1 = this.A05;
        if (r1 != null) {
            r1.A04 = z;
            int i = 1;
            if (z) {
                i = 2;
            }
            r1.A00 = i;
            ((AbstractC16300pa) r1).A01.A00();
        }
    }

    @Override // X.AbstractC63942xG
    public void A1s(AbstractC16450pp r2) {
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.A0l(r2);
        }
    }

    @Override // X.AbstractC63942xG
    public View AEg(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater layoutInflater = this.A0A;
        if (!(this instanceof C74223aN)) {
            if (this instanceof C74213aM) {
                i2 = R.layout.fixed_sticker_page;
            } else if (this instanceof C74203aL) {
                i2 = R.layout.fixed_sticker_page;
            } else if (!(this instanceof C74193aK)) {
                i2 = R.layout.fixed_sticker_page;
            } else {
                i2 = R.layout.reaction_sticker_page;
            }
        } else if (!(((C74223aN) this) instanceof C75063c4)) {
            i2 = R.layout.sticker_pack_page;
        } else {
            i2 = R.layout.third_party_pack_page;
        }
        View inflate = layoutInflater.inflate(i2, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.sticker_grid);
        if (findViewById != null) {
            this.A04 = (RecyclerView) findViewById;
            int i3 = this.A00;
            if (i3 <= 0) {
                i3 = 1;
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(i3);
            this.A03 = gridLayoutManager;
            this.A04.setLayoutManager(gridLayoutManager);
            this.A04.A0j(new AnonymousClass2XJ(this.A06, this.A02));
            RecyclerView recyclerView = this.A04;
            AnonymousClass3QG A002 = A00();
            recyclerView.setLayoutFrozen(false);
            recyclerView.A0i(A002, true, false);
            recyclerView.A0t(true);
            recyclerView.requestLayout();
            RecyclerView recyclerView2 = this.A04;
            recyclerView2.A0l(new C71933Qw(this.A0B, recyclerView2.getResources(), this.A03));
            A03(inflate);
            A01();
            return inflate;
        }
        throw null;
    }

    @Override // X.AbstractC63942xG
    public void AEw(ViewGroup viewGroup, int i, View view) {
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            C16470pr recycledViewPool = recyclerView.getRecycledViewPool();
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = recycledViewPool.A01;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C16460pq) sparseArray.valueAt(i2)).A03.clear();
                i2++;
            }
            recyclerView.setAdapter(null);
            this.A04 = null;
        }
        this.A03 = null;
        this.A05 = null;
    }

    @Override // X.AbstractC63942xG
    public void AMh(AbstractC16450pp r2) {
        List list;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null && (list = recyclerView.A0b) != null) {
            list.remove(r2);
        }
    }

    @Override // X.AbstractC63942xG
    public String getId() {
        if (this instanceof C74223aN) {
            return ((C74223aN) this).A04.A0D;
        }
        if (this instanceof C74213aM) {
            return "starred";
        }
        if (this instanceof C74203aL) {
            return "recents";
        }
        if (!(this instanceof C74193aK)) {
            return "contextual_suggestion";
        }
        StringBuilder A0S = AnonymousClass008.A0S("reaction_");
        A0S.append(((C74193aK) this).A02);
        return A0S.toString();
    }
}
