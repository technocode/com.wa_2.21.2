package X;

import java.util.concurrent.Executor;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: X.0t4  reason: invalid class name and case insensitive filesystem */
public final class EnumC18270t4 extends Enum implements Executor {
    public static final /* synthetic */ EnumC18270t4[] A00;
    public static final EnumC18270t4 A01;

    public String toString() {
        return "DirectExecutor";
    }

    static {
        EnumC18270t4 r1 = new EnumC18270t4();
        A01 = r1;
        A00 = new EnumC18270t4[]{r1};
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public static EnumC18270t4 valueOf(String str) {
        return (EnumC18270t4) Enum.valueOf(EnumC18270t4.class, str);
    }

    public static EnumC18270t4[] values() {
        return (EnumC18270t4[]) A00.clone();
    }
}
