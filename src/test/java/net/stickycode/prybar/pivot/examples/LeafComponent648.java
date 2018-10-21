package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent648
    implements PrybarComponent {

  private RootComponent648 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent648.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent648.class, "root"));
  }

  public RootComponent648 getRoot() {
    return root;
  }

}
