package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent782
    implements PrybarComponent {

  private RootComponent782 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent782.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent782.class, "root"));
  }

  public RootComponent782 getRoot() {
    return root;
  }

}
