package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent740
    implements PrybarComponent {

  private RootComponent740 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent740.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent740.class, "root"));
  }

  public RootComponent740 getRoot() {
    return root;
  }

}
