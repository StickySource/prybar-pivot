package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent665
    implements PrybarComponent {

  private RootComponent665 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent665.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent665.class, "root"));
  }

  public RootComponent665 getRoot() {
    return root;
  }

}
