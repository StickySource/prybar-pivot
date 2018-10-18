package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent810
    implements PrybarComponent {

  private RootComponent810 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent810.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent810.class, "root"));
  }

  public RootComponent810 getRoot() {
    return root;
  }

}
