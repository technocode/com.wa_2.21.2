package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.ShareCatalogLinkActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.UserJid;
import java.io.Serializable;

/* renamed from: X.2DB  reason: invalid class name */
public abstract class AnonymousClass2DB extends ActivityC004602e {
    public AnonymousClass1S0 A00;
    public AbstractC42511wp A01;
    public AnonymousClass0BP A02 = new C42481wm(this);
    public UserJid A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass01I A06 = AnonymousClass01I.A00();
    public final C27831Rq A07 = C27831Rq.A00();
    public final C27881Ry A08 = C27881Ry.A00();
    public final AbstractC03690Hg A09 = new C42471wl(this);
    public final C42391wd A0A = C42391wd.A00;
    public final AnonymousClass1S8 A0B = new C42461wk(this);
    public final C07430Xq A0C = C07430Xq.A00;
    public final AnonymousClass08B A0D = AnonymousClass08B.A00;
    public final AnonymousClass0AI A0E = AnonymousClass0AI.A00();
    public final AnonymousClass00T A0F = C002101e.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = new AnonymousClass1S0(this.A08);
        setContentView(R.layout.business_product_catalog_list);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.business_catalog_list);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.business_product_catalog_section_title));
        }
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("cache_jid"));
        if (nullable != null) {
            this.A03 = nullable;
            this.A0C.A01(this.A0B);
            this.A0A.A01(this.A09);
            CatalogListActivity catalogListActivity = (CatalogListActivity) this;
            ((AnonymousClass2DB) catalogListActivity).A01 = new AnonymousClass27o(((ActivityC004702f) catalogListActivity).A0F, catalogListActivity.A04, ((ActivityC004602e) catalogListActivity).A04, catalogListActivity.A0A, catalogListActivity.A0B, catalogListActivity.A0C, ((AnonymousClass2C0) catalogListActivity).A01, catalogListActivity.A09, catalogListActivity.A0D, ((AnonymousClass2DB) catalogListActivity).A07, ((AnonymousClass2DB) catalogListActivity).A03, ((AnonymousClass2DB) catalogListActivity).A00, catalogListActivity);
            if (bundle == null) {
                AbstractC42511wp r5 = this.A01;
                r5.A05.A03(r5.A08, r5.A06.getResources().getDimensionPixelSize(R.dimen.product_catalog_list_thumb_size));
                r5.A09();
            } else {
                this.A04 = bundle.getBoolean("catalog_loaded", false);
            }
            this.A01.A04(true);
            recyclerView.setAdapter(this.A01);
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.A0l(new C42501wo());
            this.A0D.A01(this.A02);
            Serializable serializableExtra = getIntent().getSerializableExtra("source");
            if (((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A0s) && serializableExtra != null) {
                this.A0F.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 42));
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A0A.A00(this.A09);
        this.A0C.A00(this.A0B);
        this.A0D.A00(this.A02);
        this.A00.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 100) {
            UserJid userJid = this.A03;
            Intent intent = new Intent(this, ShareCatalogLinkActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("jid", userJid.getRawString());
            startActivity(intent);
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
        this.A01.A09();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("catalog_loaded", this.A04);
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        if (!this.A05 && this.A04) {
            this.A05 = true;
            this.A07.A02(4, 23, null, this.A03);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A05 = false;
    }
}
