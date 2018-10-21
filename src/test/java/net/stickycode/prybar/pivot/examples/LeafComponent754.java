package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent754
    implements PrybarComponent {

  private RootComponent754 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent754.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent754.class, "root"));
  }

  public RootComponent754 getRoot() {
    return root;
  }

}
