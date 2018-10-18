package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent780
    implements PrybarComponent {

  private RootComponent780 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent780.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent780.class, "root"));
  }

  public RootComponent780 getRoot() {
    return root;
  }

}
