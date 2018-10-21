package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent789
    implements PrybarComponent {

  private RootComponent789 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent789.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent789.class, "root"));
  }

  public RootComponent789 getRoot() {
    return root;
  }

}
