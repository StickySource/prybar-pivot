package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent653
    implements PrybarComponent {

  private RootComponent653 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.require(new PrybarComponentLookup(this, RootComponent653.class, "root"));
  }

  public RootComponent653 getRoot() {
    return root;
  }

}
