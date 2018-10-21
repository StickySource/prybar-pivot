package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent732
    implements PrybarComponent {

  private RootComponent732 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent732.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent732.class, "root"));
  }

  public RootComponent732 getRoot() {
    return root;
  }

}
