package X;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.0bU  reason: invalid class name and case insensitive filesystem */
public class C08650bU {
    public C08660bV A00;
    public C08660bV A01;
    public C08660bV A02;
    public Calendar A03;
    public final AnonymousClass01X A04;

    public C08650bU(AnonymousClass01X r5) {
        this.A04 = r5;
        C08660bV r1 = new C08660bV(r5, 1, Calendar.getInstance());
        this.A01 = r1;
        r1.add(6, -2);
        C08660bV r12 = new C08660bV(r5, 2, Calendar.getInstance());
        this.A02 = r12;
        r12.add(6, -7);
        C08660bV r13 = new C08660bV(r5, 3, Calendar.getInstance());
        this.A00 = r13;
        r13.add(6, -28);
        Calendar instance = Calendar.getInstance();
        this.A03 = instance;
        instance.add(6, -366);
    }

    public C08660bV A00(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        if (instance.after(this.A01)) {
            return this.A01;
        }
        if (instance.after(this.A02)) {
            return this.A02;
        }
        if (instance.after(this.A00)) {
            return this.A00;
        }
        boolean after = instance.after(this.A03);
        AnonymousClass01X r4 = this.A04;
        if (after) {
            return new C08660bV(r4, 4, new GregorianCalendar(instance.get(1), instance.get(2), 1));
        }
        return new C08660bV(r4, 5, new GregorianCalendar(instance.get(1), 1, 1));
    }
}
