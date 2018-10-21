package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent3
    implements PrybarComponent {

  private RootComponent3 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent3.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent3.class, "root"));
  }

  public RootComponent3 getRoot() {
    return root;
  }

}
