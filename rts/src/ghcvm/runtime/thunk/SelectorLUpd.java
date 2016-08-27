package ghcvm.runtime.thunk;

import ghcvm.runtime.stg.StgClosure;
import ghcvm.runtime.stg.StgContext;
import ghcvm.runtime.stg.StgConstr;
import ghcvm.runtime.apply.Apply;

public class SelectorLUpd extends SelectorUpd {

    public SelectorLUpd(int i, StgClosure p) {
        super(i, p);
    }

    @Override
    public void thunkEnter(StgContext context) {
        super.thunkEnter(context);
        context.L(1, ((StgConstr) context.R(1)).getL(index));
    }
}
